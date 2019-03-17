/**
 * 在Java中，byte类型的数据是8位带符号的二进制数，取值范围是[-128, 127]
 * 运算规则：
 * 1、正数的最高位都是 0 ，正数的值就是二进制表示的值。
 * 2、负数的最高位都是 1 ，负数的值是除符号位取反后加一，然后加个负号得到得值。
 * 变化过程：原码取反，反码+1=补码
 * <p>
 * 用8位的二进制来说明一下此规则：
 * 比如：00000001，最高位是0为正数，那么表示的就是十进制的1。
 * 比如：10000001，最高位是1为负数，值是多少？取反得到01111110加1得到01111111，加个负号，得到值为-127
 */
package primitive;

public class ByteType {
    public static void main(String[] args) {
        ByteType bt = new ByteType();
        bt.Test1();
        bt.Test2();
    }

    /**
     * 整数值456，转为二进制后是111001000
     * 因为byte只有8位，所以去最后8位11001000
     * 最高位是1表示这是一个负数，认为是补码
     * 1、首先-1，补码转反码，变成11000111
     * 2、取反，将反码变原码，变成00111000
     * 3、转换位10进制为56，前面在加符号-，答案为-56
     */
    public void Test1() {
        int b = 456;
        System.out.println(Integer.toBinaryString(b));
        byte test = (byte) b;
        System.out.println(test);
    }

    public void Test2() {
        byte b = 127;
        byte c = b++;
        int j = b & 0xff;
        System.out.println("b:" + b);
        System.out.println("binary code of b:" + Integer.toBinaryString(b));
        System.out.println("c:" + c);
        System.out.println("binary code of c:" + Integer.toBinaryString(c));
        System.out.println("j:" + j);
    }
}
