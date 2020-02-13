package Exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/lol.exe");
        try {
            System.out.println("Try open lol.exe");
            new FileInputStream(f);
            System.out.println("Open successfully");
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            Date d=sd.parse("2016-06-03");
        }
        catch (FileNotFoundException e){
            System.out.println("False");
            e.printStackTrace();//打印方法的條用痕跡
        }
        catch (ParseException p){
            System.out.println("Parse Error");
            p.printStackTrace();
        }

        File k = new File("C://lol.exe");
        try {
            System.out.println("Try open lol in C");
            new FileInputStream(k);
            System.out.println("Successful");
            SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
            Date D2 = sd2.parse("2012-12-22");

        }catch (FileNotFoundException | ParseException e){
            if (e instanceof FileNotFoundException){
                System.out.println("Not exist");
            }
            if (e instanceof ParseException){
                System.out.println("Parse error");
            }
            ((Exception) e).printStackTrace();
        }finally {
            System.out.println("done");
        }

    }
}
