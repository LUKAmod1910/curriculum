package check;

public class Check {
	 
	private static String firstName = "須崎";
	private static String lastName = "亮";

	private static void printName(String A, String B) {
		System.out.println("printNameメソッド → " + A + B);
	}

	
	public static void main(String[] args) {
		printName(firstName, lastName);
		
		Pet pt = new Pet("java吉", "hoge");
		pt.introduce();
		
		RobotPet rp = new RobotPet("R2D2","ルーク");
		rp.introduce();
	}

}
 