package practice.operators;

import static net.mindview.util.Print.*;

class TankObj {
	int i = 7;
	char c = 'x';
	String s = "I am a TankObj";

	public String toString() {
		return "i: " + i +" c: " + c + " s: " + s;
	}
}

public class ObjAssignment {
	public static void main(String[] arg) {
		TankObj t1 = new TankObj();
		TankObj t2 = t1;

		print(t1);
		print(t2);

		t1.s = "Are we same!";

		print(t1);
		print(t2);
	}
}