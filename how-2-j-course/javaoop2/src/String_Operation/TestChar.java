package String_Operation;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        char c1 ='a';
        Character c = c1;
        char c2 = c;

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char [] cs = str.toCharArray();
        for (int i = 0;i < cs.length;i++){
            char cVal = cs[i];
            if (Character.isUpperCase(cVal) || Character.isDigit(cVal)){
                System.out.println(cVal);
            }
        }
    }
}
