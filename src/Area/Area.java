package test2;

public class Area extends Shape {

	public void rectangleArea (double length, double breadth) {
		double ra = length*breadth;
		System.out.println("rectangleArea: " + ra);
		}
	
	public double squareArea (double side) {
		return side*side;
		//System.out.println("squareleArea: " );
		}
	
	public void circleArea (double radius) {
		double ca = 3.1415 * (radius*radius);
		System.out.println("circleArea: " + ca);
		}

}
