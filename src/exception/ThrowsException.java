package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * how to use throws
 * 1. throws 出现在方法声明上，而throw通常都出现在方法体内。
 * 2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。
 */
public class ThrowsException {

    public static void main(String[] args) {
        method1();

    }

    private static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void method2() throws FileNotFoundException {

        File f = new File("d:/LOL.exe");

        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");

    }
}