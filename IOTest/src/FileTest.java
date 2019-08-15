import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
    @Test
    public void test1() {
        File file1 = new File("F:\\JavaSenior\\JavaSenior.iml");
        System.out.println(file1);
    }

    @Test
    public void test2() {
       File file1 = new File("E:\\hehe\\haha\\lala.txt");
       file1.mkdirs(); // 创建的是目录
    }

    @Test
    public void test3()  {  // heheh hahaha 
        FileReader fr = null;
        try {
            File file1 = new File("hehe.txt");
            fr = new FileReader(file1);

            int data;
            while ((data = fr.read()) != -1) System.out.print((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileReader fr2 = null;
        try {
            File file2 = new File("hehe.txt");
            fr2 = new FileReader(file2);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr2.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
                String str = new String(cbuf, 0, len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr2 != null) {
                try {
                    fr2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }





    }


}
