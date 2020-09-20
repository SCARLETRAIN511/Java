package stream;

import java.io.*;
import java.time.DayOfWeek;

//數據輸入輸出流練習
public class DataStream {
    private static void read(){
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\lolData.txt");
        try (
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                ){
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
            System.out.println(b);
            System.out.println(i);
            System.out.println(str);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void write(){
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\lolData.txt");
        try(
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                ){
            dos.writeBoolean(true);
            dos.writeInt(89);
            dos.writeUTF("FUCCCK UUU");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        write();
        read();
    }
}
