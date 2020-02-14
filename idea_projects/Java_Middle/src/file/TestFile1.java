package file;

import java.io.File;

public class TestFile1 {
    public static void main(String[] args) {
        File f = new File("C:\\windows");
        File[] fs = f.listFiles();
        if (fs==null){
            return;
        }
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        File minFile = null;
        File maxFile = null;
        for (File each : fs){
            if (each.isDirectory())
                continue;
            if (each.length()>maxSize){
                maxSize = each.length();
                maxFile = each;
            }
            if (each.length()!=0 && each.length()<minSize){
                minSize = each.length();
                minFile = each;
            }
        }
        System.out.printf("The biggest file is %s %n",maxFile.getAbsoluteFile());
        System.out.printf("The smallest file %s ",minFile.getAbsolutePath());
    }
}
