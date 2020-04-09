package test2;

public class Main {

	public static void main(String[] args) {
		Area ar = new Area();
		ar.rectangleArea(2, 5);
		double sa = ar.squareArea(10);
		ar.circleArea(4);
		System.out.println("squareArea: " +  sa);
	}

}
