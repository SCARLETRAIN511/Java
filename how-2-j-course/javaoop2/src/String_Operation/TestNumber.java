package String_Operation;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);//转换为Integer 对象
        int i2 = it.intValue();//转为int

        Integer it2 = i2;//自动装箱
        int i3 = it;//自动拆箱

        System.out.println(i3);

        String str1 = String.valueOf(i);//两种方法数字转字符串
        String str2 = it2.toString();

        String str3 = "999999";
        int iStr = Integer.parseInt(str3);//转换字符串为数字
        System.out.println(iStr);
        float iStr1 = (float) iStr;

        System.out.format("%,8d people died in this accident %n",iStr);//格式化输出
        System.out.printf("%,020.3f people died in this accident %n",iStr1);;
    }
}
