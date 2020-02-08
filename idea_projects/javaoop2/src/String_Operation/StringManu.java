package String_Operation;

public class StringManu {
    public static void main(String[] args) {
        String sentence = " ABC,DEFGH,IJK ";
        char c1 = sentence.charAt(0);
        System.out.println(c1);

        char[] s = sentence.toCharArray();
        System.out.println(s);

        String sub1 = sentence.substring(3);
        System.out.println(sub1);

        String[] subS = sentence.split(",");
        for (String each:subS) {
            System.out.println(each);
        }

        System.out.println(sentence.trim());//.toLowerCase(); toUpperCase()
        System.out.println(sentence.indexOf('B'));
        System.out.println(sentence.contains("x"));


    }
}
