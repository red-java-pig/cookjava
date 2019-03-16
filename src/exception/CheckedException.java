package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 1、可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理
 * 2、如果不处理，编译器，就不让你通过
 */
public class CheckedException {

    //try catch住进行处理
    /*public static void main(String[] args) {

        File f = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }*/

    //不进行处理，直接往外抛
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("d:/LOL.exe");
        new FileInputStream(f);

    }
}