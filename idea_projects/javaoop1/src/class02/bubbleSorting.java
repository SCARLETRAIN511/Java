package class02;

public class bubbleSorting {
    public static void main(String[] args) {
        int[] a = {1,24,1,3,31,313,46,32};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int k = 0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
