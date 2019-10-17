package aBunchOfAnimals;

public class Leon extends Animal implements AttackZebras {
	private String name;
	private int numberOfeatenZebrasByLeon = 0;
	private int numberOfLeons;
	
	@Override
	public void eat() {
		System.out.println("The Leon eat the Zebra!");
		super.numberOfeatenZebras++;
	}

	public void leonAttackZebra(Leon leon, Zebra zebra) {
		System.out.println("The Leon " + leon.getName() + " attacks zebra " + zebra.getName());
		this.numberOfeatenZebrasByLeon++; //se uso super e this non ho bisogno di definire i metodi e le variabili come static
	}
	
	public static void leonAttackAndEatZebra(Leon leon, Zebra zebra) {
		leon.leonAttackZebra(leon, zebra);
		leon.eat();
	}
	
	public int getEatenZebras() {
		return super.numberOfeatenZebras; //se uso super e this non ho bisogno di definire i metodi e le variabili come static
	}
	
	public int getLeons() {
		return numberOfLeons;
	}
}
