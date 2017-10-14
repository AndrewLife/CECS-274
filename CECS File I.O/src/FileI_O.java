import java.io.*;
import java.util.*;
/**
 * This program is to demonstrate File I/O and the use of delimiters
 * The program will read file named showtime.txt
 * Then it will display every character from left to right, top to bottom
 * If it runs into "\" character, the program will split into a new group of string
 * @author dfung_000
 *
 */
public class FileI_O {
	public static void main(String[]args) throws FileNotFoundException{
		String path = "showtimes.txt";
		
	File showtimes = new File(path);

	Scanner fileReader = new Scanner(showtimes);
			
	fileReader.useDelimiter("\"");
			while(fileReader.hasNext()){
				String line = fileReader.next();
				System.out.println(line.length());
				if(line.length() != 35 && line.length() !=24){
					System.out.println(line);
				}
			}
			fileReader.close();
}
}
