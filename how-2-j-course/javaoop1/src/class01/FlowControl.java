package class01;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class FlowControl {
    void main1(){
        Scanner s = new Scanner(System.in);
        System.out.println("input the year of this year");
        int year = s.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("是闰年");
        }
        else {
            System.out.println("不是");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input your height:");
        float height = s.nextFloat();
        System.out.println("Input your weight");
        float weight = s.nextFloat();
        float bmi = weight/(height*height);
        if (bmi < 18.5)
            System.out.println("Too thin");
        else if (bmi >= 18.5 && bmi < 24)
            System.out.println("Normal");
        else if (bmi >= 24 && bmi < 27)
            System.out.println("slight fat");
        else if (bmi >= 27 && bmi <30)
            System.out.println("Normal fat");
        else if (bmi >= 30)
            System.out.println("Very fat");

        //new 一个对象
        FlowControl func = new FlowControl();
        func.main1();

    }
}

