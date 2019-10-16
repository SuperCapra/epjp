package aPackForTest;

import java.util.Arrays;

public class MainForTest {
	public static void main(String[] args) {
		
		AClassPublicAndImplicit publicAndImplicit = new AClassPublicAndImplicit();
		
		int PublicIntFromA = (new AClassPublicAndImplicit()).pub;
		int ImplicitIntFromA = (new AClassImplicit()).implicit;
		
		int NonVoid = AClassPublicAndImplicit.StaticMethodMultiplicationNonVoid(ImplicitIntFromA);
		
		AClassPublicAndImplicit.getStatic(); //i metodi statici non hanno bisogno di oggetti per essere chiamati
		
		publicAndImplicit.MethodMultiplicationVoidPublic(ImplicitIntFromA);
		
		publicAndImplicit.ListOfInt(PublicIntFromA, ImplicitIntFromA);
		
		publicAndImplicit.OtcoberWeekDayName(16);
		publicAndImplicit.OtcoberWeekDayName(1);
		publicAndImplicit.OtcoberWeekDayName(ImplicitIntFromA);
		publicAndImplicit.isOctoberDayRight(16, WeekDayName.WENSDAY);
		publicAndImplicit.isOctoberDayRight(16, WeekDayName.SUNDAY);
		
		int[] arrayToSort = {5, 42, 7, 9, 12, 5, 1, 4};
		int[] arrayToSortTwo = {5, 42, 7, 9, 12, 5, 1, 4, 88};
		
		System.out.println(NonVoid + " this is a not void method");
		System.out.println(PublicIntFromA + " this is the public integer from A");
		System.out.println(ImplicitIntFromA + " this is the public integer from the implicit class");
		System.out.println(Arrays.toString(SortingAlgotithm.BoubleSorting(arrayToSort)));
		System.out.println(Arrays.toString(SortingAlgotithm.InsertionSorting(arrayToSortTwo)));
		
		
	}

}
