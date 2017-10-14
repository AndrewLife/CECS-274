import java.util.*;
public class CashRegisterTester {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		//buying 3 items
		CashRegister item = new CashRegister(3);
		//each item costs $10.25
		item.addItem(10.25);
		//display total plus 9% tax
		System.out.print("The total with tax is: $");
		System.out.printf("%.2f", item.getTotal());
		System.out.println();
		//User input amount of payment
		boolean flag = false;
		do {
				System.out.println("Enter the amount of payment: ");
				double payment = input.nextDouble();
				if(item.EnoughChange(payment) == false) {
					System.out.print("You still owe ");
					System.out.printf("%.2f", item.getChangeDue());
					System.out.println();
				}
				else {
				//Display change
				System.out.print("Your change is: $");
				System.out.printf("%.2f", item.getChangeDue()*-1);
				System.out.println("\n");
				flag = true;
				}
		}while(flag == false);
		//Return 5 items that costed $10.99
		CashRegister returnItem = new CashRegister(5, 10.99);
		//Display return price
		System.out.print("You returned " + returnItem.getCount() + " items, your get $");
		System.out.printf("%.2f", returnItem.getTotal());
	}
}
