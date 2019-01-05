package practice.operators;

import static net.mindview.util.Print.*;

public class BitOpr1 {
	public static void main(String[] args) {
		short b1 = 0X20;
		print(Integer.toBinaryString(b1));
		print(b1);
		print("-----");
		print(Integer.toBinaryString(b1<<1));
		print(b1<<1);
	}
}