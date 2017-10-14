/**
 * This Example is to teach us about Inheritance 
 * We will create Strawberry and Banana objects but inheriting Fruit class (super class)
 * @author dfung_000
 *
 */
public class FruitTester {
	public static void main(String[] args){
		Fruit redBerry = new Strawberry(); // Strawberry is a fruit. 
		
		
		//show the name 
		redBerry.showName();
		//show the color
		redBerry.showColor();
		//show the harvestTime
		redBerry.showHarvestTime();
		redBerry.showColor();
		
		Fruit yellow = new Banana();
		yellow.showColor();
		yellow.showHarvestTime();
		yellow.showName();

	}
}
