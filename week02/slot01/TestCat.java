package week02.slot01;

public class TestCat {

	public static void main(String[] args) {
		Cat cat1 = new Cat("ABC", 500, 50);
		Cat cat2 = new Cat("DEF", 30, 30);
		Cat cat3 = new Cat("GHI", 70, 70);
		System.out.println(cat1.name);
		System.out.println(cat1.hungerLevel);
		System.out.println(cat1.moodLevel);
		
		System.out.println(cat1.play(20));
		
		System.out.println(cat1.name);
		System.out.println(cat1.hungerLevel);
		System.out.println(cat1.moodLevel);
	}
	
}
