import org.junit.jupiter.api.Test;

import java.io.*;

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

            char[] cbuf = new char[5]; // 字节即
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

    // 用字节流实现两张图片的复制
    @Test
    public void test4() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("C:\\Users\\Think\\Pictures\\hehe.png");
            File decFile = new File("C:\\Users\\Think\\Pictures\\hehe1.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(decFile);

            // 文件复制
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null || fos != null) {
                    fis.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test5() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("C:\\Users\\Think\\Pictures\\hehe.png");
            File decFile = new File("C:\\Users\\Think\\Pictures\\hehe2.jpg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(decFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            // 文件复制
            byte[] buffer = new byte[5];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null || bos != null) {
                    bis.close();
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
