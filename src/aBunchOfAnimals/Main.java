package aBunchOfAnimals;

public class Main {
	public static void main(String[] args) {
		final int randomAsNumber = (int) (5 + Math.round(Math.random()*5));
		
		Animal[] animalAsLeons = new Leon[5];
		Leon[] leons = new Leon[5];
		Zebra[] zebras = new Zebra[5];
		Animal[] animalRandomAs;
		

		
		String[] names = {"Pasticcio", "Krystal", "Pippo", "Zeta", "Billy", "Ninnolo", "Graffiacane", "Malebranchie"};
		
		for (Animal animalAsLeon : animalAsLeons) {
			animalAsLeon = new Leon();
			animalAsLeon.setName(names[(int) Math.round(Math.random()*(names.length - 1))]);
		}
		
		for (Leon leon : leons) {
			leon = new Leon();
			leon.setName(names[(int) Math.round(Math.random()*(names.length - 1))]);
			System.out.println("The name of the animal is " + leon.getName() + " and has " + leon.getAge() + " years.");
		}
		
		for (Zebra zebra : zebras) {
			zebra = new Zebra();
			zebra.setName(names[(int) Math.round(Math.random()*(names.length - 1))]);
			System.out.println("The name of the animal is " + zebra.getName() + " and has " + zebra.getAge() + " years.");
		}
		
		System.out.println("-----");
		
		
//		animals[1] = new Leon();
//		animals[1].setName("Lilly");
//		leons[1].setName("Hic");
//		animalAsLeons[0].setName("Annibal");
//		zebras[0].setName("Zanzy");
//		
//		for (Animal animal : animals) {
//			if (animal instanceof Animal) {
//				System.out.println("The name of the animal is " + animal.getName() + " and has " + animal.getAge() + " years.");
//			}
//			if (animal instanceof Leon) {
//				System.out.println("The name of the animal is " + animal.getName() + " and has " + animal.getAge() + " years.");
//			}		
//			if (animal instanceof Zebra) {
//				System.out.println("The name of the animal is " + animal.getName() + " and has " + animal.getAge() + " years.");
//			}	
//		}
//		System.out.println("The name of the animal is " + animals[0].getName() + " and has " + animals[0].getAge() + " years.");
//		System.out.println("The name of the leon is " + leons[0].getName()+ " and has " + leons[0].getAge() + " years.");
//		System.out.println("The name of the leon is " + animalAsLeons[0].getName()+ " and has " + animalAsLeons[0].getAge() + " years.");
//		System.out.println("The name of the leon is " + zebras[0].getName()+ " and has " + zebras[0].getAge() + " years.");
//		
//		System.out.println("-----");
//		
//		Leon.leonAttackAndEatZebra(leons[0], zebras[0]);
//		//Leon.leonAttackAndEatZebra(animalAsLeon, zebra); visto che animalAsLeon non è in leone non può usare i metodi specifici
//		
//		
//		System.out.println("-----");
//		
//		System.out.println("The zebra that has been eaten are : " + Leon.getEatenZebras());
	}

}
