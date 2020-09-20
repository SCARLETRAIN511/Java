package stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//字符流
public class TestStream2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\lol.txt");
        try (FileReader fr = new FileReader(f)){
            char[] all = new char[(int) f.length()];

            fr.read(all);
            for (char b:all){
                System.out.println(b);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
