package _02_cat;

public class catrunner {

	public static void main(String[] args) {

		Cat cat = new Cat("cat");
		cat.meow();
		cat.printName();
		for (int i = 1; i < 11; i++) {
		cat.kill();
		}
	}

}
