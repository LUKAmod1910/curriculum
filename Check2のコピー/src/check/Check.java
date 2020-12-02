package check;
import constants.Constants;

public class Check {
	 
	private static String firstName = "須崎";
	private static String lastName = "亮";

	private static void printName(String A, String B) {
		System.out.println("printNameメソッド → " + A + B);
	}
	
    
	
	public static void main(String[] args) {
		printName(firstName, lastName);
		
		
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pt.introduce();
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();
		
		
	}

}
 