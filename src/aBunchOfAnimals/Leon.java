package aBunchOfAnimals;

public class Leon extends Animal implements AttackZebras {
	private String name;
	private int numberOfeatenZebrasByLeon = 0;
	private int numberOfLeons;
	
	@Override
	public void eat() {
		System.out.println("The Leon eat!");
	}

	public void leonAttackZebra(Leon leon, Zebra zebra) {
		System.out.println("The Leon " + leon.getName() + " attacks zebra " + zebra.getName());
		this.numberOfeatenZebrasByLeon++; //se uso super e this non ho bisogno di definire i metodi e le variabili come static
	}
	
	public static void leonAttackAndEatZebra(Leon leon, Zebra zebra) {
		leon.leonAttackZebra(leon, zebra);
		leon.eat();
		numberOfeatenZebras++;
		leon.numberOfeatenZebrasByLeon++;
	}
	
	public static int getEatenZebras() {
		return numberOfeatenZebras; //se uso super e this non ho bisogno di definire i metodi e le variabili come static
	}
	
	public int getLeons() {
		return numberOfLeons;
	}
	
	public int getLeonss() {
		return numberOfLeons;
	}
	
	@Override
	public String getName() {
		name = name + " The Leon";
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
