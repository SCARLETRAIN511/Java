package class02;

public class Array {
    public static void main(String[] args) {
        //声明一个数组
        int[] a;
        a = new int[6];//指向数组

        int[] b = new int[4];
        b[0] = (int) (Math.random()*100);
        b[1] = (int) (Math.random()*100);
        b[2] = (int) (Math.random()*100);
        b[3] = (int) (Math.random()*100);
        int smallest = b[0];
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
            if (b[i] < smallest){
                smallest = b[i];

            }
        }
        System.out.println("the smallest number in this array is " + smallest);
    }
}
