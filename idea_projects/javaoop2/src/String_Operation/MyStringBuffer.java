package String_Operation;

public class MyStringBuffer implements IStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer(){
        value = new char[capacity];
    }

    public MyStringBuffer(String str){
        if (str != null){
            value = str.toCharArray();
        }
        length = value.length;
        if (capacity < value.length){
            capacity = value.length*2;
        }
    }


    public void reverse(){
        for (int i = 0;i<length/2;i++){
            char temp = value[i];
            value[i] = value[length-i-1];
            value[length-i-1]=temp;
        }
    }

    public void insert(int pos,String b){
        if (pos<0)
            return;
        if (pos>length)
            return;
        if (null==b)
            return;

        while (length+b.length()>capacity){
            capacity = (int) ((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value = newValue;
        }
        char[] cs = b.toCharArray();
        System.arraycopy(value,pos,value,pos+cs.length,length-pos);
        System.arraycopy(cs,0,value,pos,cs.length);
        length = length + cs.length;
    }
    public int length(){
        return length;
    }

    public void append(String str){
        insert(length,str);
    }

    public void append(char c){
        append(String.valueOf(c));
    }

    public void insert(int pos, char b){
        insert(pos,String.valueOf(b));
    }

    public void delete(int start, int end) {
        if (start < 0)
            return;
        if (start>length)
            return;
        if (end < 0)
            return;
        if (end > length)
            return;
        if (start >= end)
            return;
        System.arraycopy(value,end,value,start,length-end);
        length-=end-start;
    }

    public void delete(int start){
        delete(start,length);
    }
}
