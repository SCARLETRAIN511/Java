package class02;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,24,13,1,33,134,43};
        int[] b = {21,1435,2324};
        int[] c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for (int i:c){
            System.out.println(i);
        }
    }
}
