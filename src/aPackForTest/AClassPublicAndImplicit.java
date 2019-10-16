package aPackForTest;

public class AClassPublicAndImplicit {
	public int pub = 10;
	public static int pubStatic = 8;
	public static int publicStaticInt = pubStatic + AClassImplicit.implicitIntStatic;
	
	public void nonStatic() {
		System.out.println("Non static method");
	}
	
	public static void getStatic() {
		System.out.println("This is a static method");
	}
	
	public void MethodMultiplicationVoidPublic(int value) {
		System.out.println(value);
	}
	
	public void ListOfInt(int... value) { //esempio di switch con gli interi
		int i = 1;
		for(int result : value) {
			switch (i) {
			case 1 :
				System.out.println("The " + i + "st element is : " + result);
				i++;
				break;
			case 2 :
				System.out.println("The " + i + "nd element is : " + result);
				i++;
				break;
			default :
				System.out.println("The " + i + "th element is : " + result);
				i++;
				break;
			}
		}
	}
	
	
	public void OtcoberWeekDayName(int value) {
		int octoberDay = value % 31;
		int octoberDayWeek = (octoberDay + 1) % 7;
		WeekDayName octoberWeekName = WeekDayName.MONDAY; 
		
			switch (octoberDayWeek) {
			case 1 :
				octoberWeekName = WeekDayName.MONDAY;
				break;
			case 2 :
				octoberWeekName = WeekDayName.TUESDAY;
				break;
			case 3 :
				octoberWeekName = WeekDayName.WENSDAY;
				break;
			case 4 :
				octoberWeekName = WeekDayName.THURSDAY;
				break;
			case 5 :
				octoberWeekName = WeekDayName.FRIDAY;
				break;
			case 6 :
				octoberWeekName = WeekDayName.SATHURDAY;
				break;
			case 7 :
				octoberWeekName = WeekDayName.SUNDAY;
				break;
			}
			
			switch (octoberWeekName) {
			case MONDAY :
				System.out.println("The week day of " + octoberDay + " of october is monday");
				break;
			case TUESDAY :
				System.out.println("The week day of " + octoberDay + " of october is tuesday");
				break;
			case WENSDAY :
				System.out.println("The week day of " + octoberDay + " of october is wensday");
				break;
			case THURSDAY :
				System.out.println("The week day of " + octoberDay + " of october is thursday");
				break;
			case FRIDAY :
				System.out.println("The week day of " + octoberDay + " of october is friday");
				break;
			case SATHURDAY :
				System.out.println("The week day of " + octoberDay + " of october is sathurday");
				break;
			case SUNDAY :
				System.out.println("The week day of " + octoberDay + " of october is sunday");
				break;
			}	
		}
	
	public WeekDayName getOtcoberWeekDayName(int value) {
		int octoberDay = value % 31;
		int octoberDayWeek = (octoberDay + 1) % 7;
		WeekDayName resultDay = WeekDayName.MONDAY; 
		
			switch (octoberDayWeek) {
			case 1 :
				resultDay = WeekDayName.MONDAY;
				break;
			case 2 :
				resultDay = WeekDayName.TUESDAY;
				break;
			case 3 :
				resultDay = WeekDayName.WENSDAY;
				break;
			case 4 :
				resultDay = WeekDayName.THURSDAY;
				break;
			case 5 :
				resultDay = WeekDayName.FRIDAY;
				break;
			case 6 :
				resultDay = WeekDayName.SATHURDAY;
				break;
			case 7 :
				resultDay = WeekDayName.SUNDAY;
				break;
			}
			return resultDay;
		}
	
	public void isOctoberDayRight(int day, WeekDayName weekName) {
		WeekDayName resultDay = getOtcoberWeekDayName(day);
		
		if (resultDay == weekName) {
			System.out.println("You inserted the right couple!");
		} else {
			System.out.println("You inserted the wrong couple!");
		}
	}
	
	public static int StaticMethodMultiplicationNonVoid(int value) {
		int result = value*pubStatic;
		return result;
	}
}

class AClassImplicit {
	public int implicit = 42;
	public static int implicitIntStatic = 79;
}
