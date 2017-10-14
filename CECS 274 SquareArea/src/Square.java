
public class Square {
	private int sides;
	private int counter;
	
	/**
	 * constructor
	 * Creates a square with specified side size
	 * @param num	size of each side of square
	 */
	public Square(int num){
		sides = num;
	
	}
	
	/**
	 * Calculates the area of the square
	 * 
	 * @return	area of the square
	 */
	public int getArea(){
		if(sides == 1){
			return 1;
		}
		Square row = new Square(sides - 1);
		int area = row.getArea();
		return area = area + sides + (sides - 1);
	}
	
	/**
	 * Display a visual representation of the square
	 */
	public void printSquare(){
		for(int i = 0; i < sides; i++){
			for(int j = 0; j < sides; j++){
				System.out.print("[]");
			}
			System.out.println();
		}
	}
}
