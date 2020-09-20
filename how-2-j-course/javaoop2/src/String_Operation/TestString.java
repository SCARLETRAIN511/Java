package String_Operation;

import Class_and_object02.Hero;

public class TestString {
    public static void main(String[] args) {
        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String teemo = new String("提莫"); //创建了两个字符串对象

        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);//  通过字符数组创建一个字符串对象

        String hero3 = garen + teemo;
        System.out.println(hero);
        System.out.println(hero3);
    }
}
