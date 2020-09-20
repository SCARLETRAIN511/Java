package file;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\tangj\\Desktop\\java\\11.txt");
        System.out.println("The abs path of f1 is "+f1.getAbsolutePath());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.length());
    }
}
