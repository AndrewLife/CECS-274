import java.util.*;

/**
 * This example is used to demonstrate how to Sort values in an Arraylist in ascending order
 * The program will begin by asking the user to entry in random names that will be added to the Arraylist
 * user will then enter 0 when finished entering in the names
 * The program will then sort the names in ascending order and display the list
 * @author dfung_000
 *
 */
public class SortedName {
	public static void main(String[]args){
		
		//Scanner Class
		Scanner input  = new Scanner(System.in);
		
		//Initialize ArrayList
		ArrayList<String>Names = new ArrayList<String>();
		
		//Ask User to input names, Enter 0 to end
		System.out.println("Please enter names, Enter 0(zero) when done: ");
		String name;
		
		//Add names into ArrayList until User enters 0
		do{
			name = input.nextLine();
			Names.add(name);
		}while(!input.hasNextInt());
		
		//Sort ArrayList
		Collections.sort(Names);
		
		//Print ArrayList
		for(int i = 0; i < Names.size(); i++){
			System.out.println(Names.get(i));
		}
	}
}
