package String_Operation;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "The light";
        String str2 = new String("The light");
        System.out.println(str1 == str2);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
    }
}
