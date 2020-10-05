import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		// Create the Scanner
		Scanner input = new Scanner(System.in);
		//Output message to user to input a positive integer
		System.out.println("Please enter a positive integer to determine its factors:");
		//lets user input 
		int positiveInt = input.nextInt();
		//outputs a message that the factors of their positive integer are as follows
		System.out.println("The factors of " + positiveInt + " are:");
		//initializes anddeclares count as an int
		int count = 0;
		//this loop only works if the count is less than oe equal to the positive integer
		do{
			//adds 1 to count everytime the loop repeats 
			count = count + 1;
			//if the positive integer divides by count with no remainder
			if(positiveInt%count == 0 ){
				//then it prints the count as its factor
				System.out.println(count);
				//or else just skips and repeats the loop again or quits if the positive int is equal to or less than while
			}else;
		}while(count <= positiveInt);  
		//only works when count is less than or equal to positive int 
  }
}
