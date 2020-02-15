package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class TestStream4 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\lol2.txt");
        try(FileWriter fw = new FileWriter(f)){
            String data = "I love u";
            char[] cs = data.toCharArray();
            fw.write(cs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
