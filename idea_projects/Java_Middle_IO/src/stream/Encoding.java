package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encoding {
    public static void encodeFile(File encodingfile,File EncodedFile){
        try (FileReader fr = new FileReader(encodingfile); FileWriter fw = new FileWriter(EncodedFile)){
            char[] fileContent = new char[(int) encodingfile.length()];
            fr.read(fileContent);
            System.out.println("加密前的内容：");
            System.out.println(new String(fileContent));
            encode(fileContent);
            System.out.println("加密後内容");
            System.out.println(new String(fileContent));
            fw.write(fileContent);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void encode(char[] fileContent){
        for (int i = 0;i<fileContent.length;i++){
            char c = fileContent[i];
            if (isLetterOrDigit(c)){
                switch (c){
                    case '9':
                        c='0';
                        break;
                    case 'z':
                        c='a';
                        break;
                    case 'Z':
                        c='A';
                        break;
                    default:
                        c++;
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
        File encodingFile = new File("C:\\Users\\tangj\\Desktop\\java\\lol2.txt");
        File encodedFile = new File("C:\\Users\\tangj\\Desktop\\java\\lol3.txt");
        encodeFile(encodingFile,encodedFile);
    }
}
