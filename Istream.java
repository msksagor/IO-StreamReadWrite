package streamIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Istream {
    public static void main(String[] args) throws Exception {
        String path = "D:\\Target\\Tutorial\\Java complate\\1.core java\\problem.txt";
        File file  = new File(path);
        
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
        int i;
        while ((i=bufferedInputStream.read())!=-1) {
            System.out.print((char)i);
            
        }
        fis.close();
    }
}
