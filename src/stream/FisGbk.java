package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream只是按照字节读出文件内容，读出之后需要按正确的编码，才能正确识别
 */
public class FisGbk {

    public static void main(String[] args) {
        File f = new File("d:/test/test.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);

            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all) {
                int i = b & 0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在GBK的棋盘上去：");
            String str = new String(all, "GBK");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}