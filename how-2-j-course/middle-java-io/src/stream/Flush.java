package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Flush {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\lol2.txt");
        try(FileWriter fw = new FileWriter(f); PrintWriter pr = new PrintWriter(fw))
        {
            pr.println("This is written by printWriter");
            pr.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
