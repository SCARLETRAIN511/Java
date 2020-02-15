package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream1 {
    public static void main(String[] args) {
        try {
        File ff = new File("C:\\Users\\tangj\\Desktop\\java\\11.txt");
        FileInputStream fis = new FileInputStream(ff);
        byte[] all = new byte[(int) ff.length()];
        fis.read(all);
        for (byte b:all){
            System.out.println(b);
        }
        fis.close();
        } catch (IOException e){
            System.out.println("Failed");
            e.printStackTrace();
        }
    }
}
