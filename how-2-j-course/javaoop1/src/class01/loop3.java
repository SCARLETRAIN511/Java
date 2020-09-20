package class01;

public class loop3 {
    public static void main(String[] args) {
        outloop:
        for (int i = 3; i < 10; i++){
            System.out.println(i);
            for (int j = 2;j < i; j++){
                if (i%j == 0){
                    break outloop;
                }
            }
        }
    }
}
