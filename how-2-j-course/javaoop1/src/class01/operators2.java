package class01;

import java.util.Scanner;

public class operators2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is day of today");
        int day = s.nextInt();
        String status = day >= 6? "Weekend":"Weekdays";
        System.out.println("today is in " + status);
    }
}
