package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 从一个按utf8编码的纯中文文件中读取字符，去掉开头的BOM，在屏幕打印出来
 */
public class RemoveBom {
    public static void main(String[] args) {
        File f = new File("d:/test/test.txt");
        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] bytes = new byte[(int) f.length()];
            fis.read(bytes);
            System.out.println(bytes.length);
            byte[] newBytes=new byte[24];
            System.arraycopy(bytes,3,newBytes,0,24);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            for (byte b : newBytes) {
                //int i = b & 0xff;
                System.out.println(b);
            }
            System.out.println(new String(bytes,"UTF-8"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
