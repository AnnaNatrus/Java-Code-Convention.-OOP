package test2;

public class Simple {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		try {
		triangle.setPointOne(0, 0);
		triangle.setPointTwo(0, 0);
		triangle.setPointThree(4, -8);
		triangle.countSides();
		triangle.checkExeptions();
		triangle.areaTr();
	}
		catch (MyExeption ex) {
			System.out.println(ex.toString());
//			System.out.println(ex.getMessage());		 
		 }
	}
	
}
