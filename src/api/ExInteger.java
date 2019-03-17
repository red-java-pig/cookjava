package api;

public class ExInteger {
    public static void main(String[] args) {
        //the number of bytes used to represent an int value
        System.out.println(Integer.BYTES);
        //a constant holding the maximum value
        System.out.println(Integer.MAX_VALUE);
        //a constant holding the minimum value
        System.out.println(Integer.MIN_VALUE);
        //The number of bits used to represent an int value
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);


        System.out.println("----------");

        int i = 0x1f;
        System.out.println("i:" + i);

        System.out.println(Integer.bitCount(22));
    }
}
