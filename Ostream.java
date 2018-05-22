package streamIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ostream {
    public static void main(String[] args) throws Exception{
         String path = "D:\\Target\\Tutorial\\Java complate\\1.core java\\problem.txt";
        File file  = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        String content = "Habib wahid is My favourite Singer";
        byte b[] = content.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();
        System.out.println("Success");
        
    }
}
