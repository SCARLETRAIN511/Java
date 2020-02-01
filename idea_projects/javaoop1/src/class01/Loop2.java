package class01;

public class Loop2 {
    public static void main(String[] args) {
        int fundPerMonth = 1000;
        int fundPerYear = fundPerMonth * 12;
        int sum = 0;
        int target = 1000000;
        float rate = 0.2f;
        for (int j = 1;j < 100; j++){
            int year = j;
            float compoundInterestRate = 1;
            for (int i = 0; i < year ; i++){
                compoundInterestRate *= (1 + rate);
            }
            int interest = (int) (fundPerYear * compoundInterestRate);
            sum += interest;
            System.out.println(year + "th year we have money " + sum);
            if (sum >= target){
                System.out.println("The year needed is " + year);
                break;
            }
        }


    }
}
