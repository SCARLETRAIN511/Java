package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class decoding {
    public static void decodeFile(File decodingfile, File decodedFile){
        try (FileReader fr = new FileReader(decodingfile); FileWriter fw = new FileWriter(decodedFile)){
            char[] fileContent = new char[(int) decodingfile.length()];
            fr.read(fileContent);
            System.out.println("解密前的内容：");
            System.out.println(new String(fileContent));
            decode(fileContent);
            System.out.println("解密后内容");
            System.out.println(new String(fileContent));
            fw.write(fileContent);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void decode(char[] fileContent){
        for (int i = 0;i<fileContent.length;i++){
            char c = fileContent[i];
            if (isLetterOrDigit(c)){
                switch (c){
                    case '0':
                        c='9';
                        break;
                    case 'a':
                        c='z';
                        break;
                    case 'A':
                        c='Z';
                        break;
                    default:
                        c--;
                        break;
                }
            }
            fileContent[i]=c;
        }
    }
    public static boolean isLetterOrDigit(char c){
        String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return -1 == letterOrDigital.indexOf(c) ? false:true;
    }

    public static void main(String[] args) {
        File decodingFile = new File("C:\\Users\\tangj\\Desktop\\java\\lol3.txt");
        File decodedFile = new File("C:\\Users\\tangj\\Desktop\\java\\lol4.txt");
        decodeFile(decodingFile,decodedFile);
    }
}
