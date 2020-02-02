package class02;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] a = {18,64,323,523,22,4,42};
        for (int i=0;i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int k = 0; k<a.length;k++){
            System.out.println(a[k]);
        }

    }
}
