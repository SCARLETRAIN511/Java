package class02;

public class TdArray {
    public static void main(String[] args) {
        int[][] a= new int[][]{
                {1,2,3},
                {3,4,5},
                {3,45,21}
        };
        int max = -1;
        int target_i = -1;
        int target_j = -1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[1].length;j++){
                if (a[i][j] >= max){
                    max = a[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }
        System.out.println(target_i);
        System.out.println(target_j);
    }
}
