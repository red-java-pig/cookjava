package psn.redpig.tij4.exercise.operators;

import static net.mindview.util.Print.*;

public class BitOpr {
	public static void main(String[] args) {
		int b1 = 0Xfff;
		int b2 = 0xf0f;
		int b3 = 0xf0;
		print("-----");
		print(Integer.toHexString(b1&b2));
		print("-----");
		print(Integer.toHexString(b1|b2));
		print("-----");
		print(Integer.toHexString(b1^b2));
		print("-----");
		print(Integer.toHexString(~b3));

		boolean bb1 = true;
		boolean bb2 = false;
		print("-----");
		print(bb1&bb2);
		print("-----");
		print(bb1|bb2);
		print("-----");
		print(bb1^bb2);
	}
}