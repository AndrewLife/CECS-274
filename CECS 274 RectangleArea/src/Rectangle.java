
public class Rectangle {
	public static void main(String [] args) {
		//Initalize values
		double length = 8;
		double width = 3;
		double area;
		double perimeter;
		
		//Calculate Area and Perimeter of Rectangle
		area = RecArea(length, width);
		perimeter = RecPerimeter(length, width);
		
		//DisplayResult
		System.out.println("Rectangle with length: " + length + " and width: " + width 
				+ " \nArea: " + area + " \nPerimeter: " + perimeter);
	}
	
	/**
	 * Calculates area of a Rectangle
	 * @param a			length of a rectangle
	 * @param b 		width of a rectangle
	 * @return area 	area of a rectangle
	 */
	public static double RecArea(double a, double b) {
		double area = a * b;
		return area;
	}
	
	/**
	 * Calculates perimeter of a Rectangle
	 * @param a					length of a rectangle
	 * @param b					width of a rectangle
	 * @return perimeter		perimeter of a rectangle
	 */
	public static double RecPerimeter(double a, double b) {
		double perimeter = 2*a + 2*b;
		return perimeter;
	}
}
