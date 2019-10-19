package aBunchOfAnimals;

public class SavanaBunch {
	public static void main(String[] args) {
		final int randomAsNumber = (int) (5 + Math.round(Math.random()*5));
		
		Animal[] animalAsLeons = new Leon[5];
		Leon[] leons = new Leon[5];
		Zebra[] zebras = new Zebra[5];
		Animal[] animalRandomAs;
		

		
		String[] names = {"Pasticcio", "Krystal", "Pippo", "Zeta", "Billy", "Ninnolo", "Graffiacane", "Malebranchie"};
		
		for (Animal animalAsLeon : animalAsLeons) {
			animalAsLeon = new Leon(names[(int) Math.round(Math.random()*(names.length - 1))], 0, 0);
		}
		
		for (Leon leon : leons) {
			leon = new Leon(names[(int) Math.round(Math.random()*(names.length - 1))], 0, 0);
			System.out.println("The name of the animal is " + leon.getName() + " and has " + leon.getAge() + " years.");
		}
		
		for (Zebra zebra : zebras) {
			zebra = new Zebra(names[(int) Math.round(Math.random()*(names.length - 1))], 0);
			//zebra.setName(names[(int) Math.round(Math.random()*(names.length - 1))]);
		}
		
		System.out.println("-----");
		
		
		Animal animal = new Leon("Graffiacane", (int) (5 + Math.round(Math.random()*5)), 0);
		Leon leo = new Leon("Malebranchie", (int) (5 + Math.round(Math.random()*5)), 0);
		Leon leon = new Leon("Ciccio", (int) (5 + Math.round(Math.random()*5)), 0);
		Zebra zebra = new Zebra("Zanzy", (int) (5 + Math.round(Math.random()*5)));

		
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
		System.out.println("The name of the animal is " + animal.getName() + " and has " + animal.getAge() + " years.");
		System.out.println("The name of the leon is " + leo.getName()+ " and has " + leo.getAge() + " years.");
		System.out.println("The name of the leon is " + leon.getName()+ " and has " + leon.getAge() + " years.");
		System.out.println("The name of the leon is " + zebra.getName()+ " and has " + zebra.getAge() + " years.");
		
		System.out.println("-----");
		
		Leon.leonAttackAndEatZebra(leons[0], zebras[0]);
		//Leon.leonAttackAndEatZebra(animalAsLeon, zebra); visto che animalAsLeon non è in leone non può usare i metodi specifici
		
		
		System.out.println("-----");
		
		System.out.println("The zebra that has been eaten are : " + Leon.getEatenZebras());
	}

}
