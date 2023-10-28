package prasad.exam;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day= Utility.readNumber();
		
		switch (day) {
		case 0:
			System.out.println("given day is Sunday");
            break;
		case 1:
			System.out.println("given day is Monday");
            break;
		case 2:
			System.out.println("given day is Tuesday");
            break;
		case 3:
			System.out.println("given day is Wednesday");
            break;
		case 4:
			System.out.println("given day is Thursday");
            break;
		case 5:
			System.out.println("given day is Friday");
            break;
      	case 6:
      		System.out.println("given day is Saturday");
            break;
       default:
    	   System.out.println("Give A Valid Input... ");
    	   
			break;
		}

	}

}
