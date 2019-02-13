package psn.redpig.tij4.exercise.operators;

import static net.mindview.util.Print.*;

class Dog {
	String name;
	String says;

	Dog(String sName, String sSays) {
		name = sName;
		says = sSays;
	}

	public String printString() {
		return "name: " + name + " says: " + says;
	}
}

public class Ex5Ex6 {
	public static void main(String[] args) {
		Dog d1 = new Dog("spot", "Ruff");
		Dog d2 = new Dog("scruffy", "Wurf");

		print(d1.printString());
		print(d1);
		print(d2.printString());
		print(d2);

		Dog d3 = d1;
		print(d3.printString());
		print(d3);
		if(d1.equals(d3))
			print(true);
		else
			print(false);

		if(d1 == d3)
			print("true");
		else
			print("false");

		d3 = new Dog("spot", "Ruff");
		print(d3.printString());
		print(d3);
		if(d1.equals(d3))
			print(true);
		else
			print(false);

		if(d1 == d3)
			print(true);
		else
			print(false);
	}
}