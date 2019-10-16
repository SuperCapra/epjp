package aPackForTest;

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
		publicAndImplicit.isOctoberDayRight(16, WeekDayName.WENSDAY);
		publicAndImplicit.isOctoberDayRight(16, WeekDayName.SUNDAY);

		System.out.println(NonVoid + " this is a not void method");
		System.out.println(PublicIntFromA + " this is the public integer from A");
		System.out.println(ImplicitIntFromA + " this is the public integer from the implicit class");
		
	}

}
