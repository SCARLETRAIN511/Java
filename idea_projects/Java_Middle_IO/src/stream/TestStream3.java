package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream3 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\tangj\\Desktop\\java\\lol.txt");
            byte[] data = {88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();
        }catch (IOException e){
            System.out.println("Write in failed");
            e.printStackTrace();
        }
    }
}
