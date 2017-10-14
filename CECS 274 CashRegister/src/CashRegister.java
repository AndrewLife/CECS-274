
public class CashRegister {
	   private double[] prices = new double[100];
	   private int count;
	   private double total = 0;
	   
	   /**
	    * Number of items when customer is buying
	    * @param numberOfItems number of items
	    */
	   public CashRegister(int numberOfItems){
		   count = numberOfItems-1;
	   }
	   
	   /**
	    * This constructor is used when customer is returning items
	    * @param counter number of items
	    * @param prices price of items
	    */
	   public CashRegister(int counter, double prices){
		   count = counter-1;
		   addItem(prices);
	   }
	   
	   /**
	    * inputing prices for each amount of items
	    * @param price
	    */
	   public void addItem(double price)
	   {
	      prices[count] = price;
	      count++;
	   }
	   
	   /**
	    * Returns the item count
	    * @return count
	    */
	   public double getCount()
	   {
	      return count;
	   }
	   
	   /**
	    * Get the total price of all items with 9% tax
	    * @return total
	    */
	   public double getTotal()
	   {
	      for (int i = 0; i < count; i++)
	      {
	         total = total + prices[i];
	      }
	      double tax = total * .09;
	      total = total + tax;
	      return total;
	   }
	   
	   /**
	    * Get total
	    * @param payment custorm's payment
	    * @return change
	    */
	   public double getChangeDue(){
		   return total;
	   }
	   
	   /**
	    * calculates the total payment, if customer still owes money, return false, otherwise return true
	    * @param payment
	    * @return
	    */
	   public boolean EnoughChange(double payment) {
		   total = total - payment;
		   if(total > 0) {
			   return false;
		   }
		   else {
			   return true;
		   }
	   }
}
