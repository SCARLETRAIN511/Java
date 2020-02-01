package class01;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("Please input you height in M:");
        float height = s.nextFloat();
        System.out.println("Please input your weight in kg:");
        float weight = s.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("The bmi is :" + bmi);
        int k = 10;
        k++;
        System.out.println(k);
    }
}
