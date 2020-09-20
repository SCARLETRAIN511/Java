package class01;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the number");
        int k = s.nextInt();
        int fac = 1;
        while (k>=1){
            fac *= k;
            k -= 1;
        }
        System.out.println("The factorial of this number is :" + fac);
        int moneryEachDay = 0;
        int day = 10;
        int sum = 0;
        for (int i = 1; i<=day;i++){
            if (moneryEachDay == 0)
                moneryEachDay = 1;
            else
                moneryEachDay *= 2;
            sum += moneryEachDay;
        }
        System.out.println("the todal money received is " + sum);
    }
}
