package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\tangj\\Desktop\\java\\11.txt");
            FileOutputStream fos = new FileOutputStream(f);
            System.out.println(fos);
        }catch (IOException e){
            System.out.println("Failed");
            e.printStackTrace();
        }
    }
}
