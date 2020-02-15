package stream;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) {
        Hero hs[] = new Hero[10];
        for (int i = 0;i < hs.length;i++){
            hs[i] = new Hero("hero:"+Integer.toString(i));
        }
        File f = new File("C:\\Users\\tangj\\Desktop\\java\\garen.lol");

        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            oos.writeObject(hs);

            Hero[] hs2 = (Hero[]) ois.readObject();
            System.out.println("查看文件中的元素");
            for (Hero h : hs2){
                System.out.println(h.name);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}
