package practice.operators;

import static net.mindview.util.Print.*;

class InnerObjAlias {
	float f = 7.7f;

	public String toString() {
		return "f: " + f;
	}
}
public class ObjAlias {
	static void f(InnerObjAlias ioa) {
		InnerObjAlias in = ioa;
		in.f = 8.8f;
	}

	static void f(float f) {
		f = 7.7f;
	}

	public static void main(String[] args) {
		InnerObjAlias i1 = new InnerObjAlias();
		print(i1);
		f(i1);
		print(i1);
		f(i1.f);
		print(i1);
	}
}