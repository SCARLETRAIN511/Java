package class02;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] a = {1,3,13,13,313,332,21,122};
        for (int i:a){
            System.out.println(i);
        }
        int maxNum = a[0];
        for (int j:a){
            if (j>= maxNum){
                maxNum = j;
            }

        }
        System.out.println("The biggest number in this array is "+maxNum);
    }
}
