package String_Operation;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String[] ss = new String[8];
        for (int i = 0;i<ss.length;i++){
            String randomString = StringSort.randomString(5);
            ss[i] = randomString;
        }
        for (int i = 0;i<ss.length;i++){
            for (int j = 0;j<ss.length-i-1;j++){
                char firstChar1 = ss[i].charAt(0);//按照首字母排序
                char firstChar2 = ss[i + 1].charAt(0);
                if (firstChar1 > firstChar2){
                    String temp = ss[i];
                    ss[i] = ss[i+1];
                    ss[i+1] = temp;//冒泡排序
                }
            }
        }
        System.out.println(Arrays.toString(ss));
    }
    public static String randomString(int length){
        String pool = "";
        for (short i = '0';i<='9';i++){
            pool+=(char) i;
        }
        for (short i = 'a';i<='z';i++){
            pool+=(char) i;
    }
        for (short i = 'A';i<='z';i++){
            pool += (char) i;
        }
        char[] cs = new char[length];
        for (int i = 0;i<cs.length;i++){
            int index = (int) (Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }//随机生成长度为n的字符串。
}
