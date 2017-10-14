
public class Lock {
	private int combination = 1729; 
	   private int input = 0;
	   private String numbers = "";
	   /**
	      Simulates a digit button push.
	      @param button a digit 0 ... 9
	   */
	   public void push(int button)
	   {
	      Integer.toString(button);
	      numbers += button;
	   }
	   
	   /**
	      Simulates a push of the open button.
	      @return true if the lock opened
	   */
	   public boolean open()
	   {
	      input = Integer.parseInt(numbers);
	      numbers = "";
	      if (input == combination){
	    	  return true;
	      }
	      else{
	    	  return false;
	      }
	   }
}
