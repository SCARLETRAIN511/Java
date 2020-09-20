package collection;
import java.util.*;
import java.io.*;

//This is the java file used in the coursera ds course week1 assginment.
public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers){
        long max_product = 0;
        int n = numbers.length;
        Arrays.sort(numbers);
        max_product = (long) numbers[n-2]*(long) numbers[n-1];
        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream){
            try{
                br = new BufferedReader(new InputStreamReader(stream));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        String next(){
            while (st == null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
