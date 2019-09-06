package chapter1;

public class SwitchCaseText {

	public static void main(String[] args) {
		int weekDay=6;
		System.out.println("指定的数是:"+weekDay);
		switch(weekDay){
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		}
	
	}

}
