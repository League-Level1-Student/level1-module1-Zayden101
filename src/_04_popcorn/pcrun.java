package _04_popcorn;

public class pcrun {
public static void main(String[] args) {
	
	Popcorn pop = new Popcorn("pop");
	Microwave micro = new Microwave();

	micro.putInMicrowave(pop);
	micro.setTime(2);
	micro.startMicrowave();
	pop.eat();
	
}
}
