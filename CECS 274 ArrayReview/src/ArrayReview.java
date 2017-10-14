/**
 * This example is used to review on arrays
 * We will begin by intializing arrays with double values
 * We then round each value in the array to the closes whole number
 * Finally we display the new values
 * @author dfung_000
 *
 */
public class ArrayReview {
	//Round elements
	public static double [] roundArray(double array[]){
		double [] rarray = new double [array.length];
		for (int i = 0; i < array.length; i++){
			rarray[i] = Math.round(array[i]);
		}
		return rarray;
		}

		//Main Method
	public static void main(String[]args){
		//Initialize array
		double [] myArray = {10.1,10.2,10.3,10.4,10.5};
		//Call roundArray
		myArray = roundArray(myArray);
		//Call printArray
		printArray(myArray);
	}

		//Print Array
	public static void printArray(double array[]){
		for(double elements: array){
			System.out.println(elements);
		}
	}
}
