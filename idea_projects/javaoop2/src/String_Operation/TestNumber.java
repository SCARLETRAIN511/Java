package String_Operation;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);//转换为Integer 对象
        int i2 = it.intValue();//转为int

        Integer it2 = i2;//自动装箱
        int i3 = it;//自动拆箱
    }
}
