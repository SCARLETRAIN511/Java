package class02;

import javax.swing.*;

public class array02 {
    public static void main(String[] args) {
        int[] a= new int[]{100,23,121,21,888,212};
        int[] b = {1,2,3,4};
        int[] c = new int[5];
        for (int i = 0;i<5;i++){
            c[i] =(int) (Math.random()*100);
            System.out.println(c[i]);
        }
        for (int j = 0; j<(int) (c.length/2); j++){
            int temp = c[j];
            c[j] = c[c.length-j-1];
            c[c.length-j-1] = temp;
        }
        for (int ind = 0; ind<5;ind++){
            System.out.println(c[ind]);
        }
    }
}
