package String_Operation;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class SameString {
    public static void main(String[] args) {
        String[] ss = new String[100];

        for (int i = 0;i<ss.length;i++){
            ss[i] = SameString.randomString(2);
        }//生成随机字符串

        String volume = "";
        for (String s1:ss){
            int repeat = 0;
            for (String s2:ss) {
                if (s1.equalsIgnoreCase(s2)){
                    repeat ++;
                    if (repeat == 2){
                        volume = volume + s1 +",";
                        break;
                        }
                    }
                }
            }

        String[] Duplicated = volume.split(",");//拆分字符串为数组
        for (int i=0;i<ss.length;i++){
            System.out.print(ss[i]+" ");
            if (i%20==19){
                System.out.println();
            }
        }//打印生成的字符串

        for (int i = 0;i<Duplicated.length;i++){
            System.out.println(Duplicated[i]+"");
        }//打印重复的字符串
    }

    public static String randomString(int length){
        String pool = "";
        for (char i = '0';i<='9';i++){
            pool += (char) i;
        }
        for (char i = 'a';i<='z';i++){
            pool += (char) i;
        }
        for (char i = 'A';i<='Z';i++){
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
