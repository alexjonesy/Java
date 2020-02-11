// importing scanner
import java.util.Scanner;
public class RewriteCode {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();
			String word = "zero";

			if (num == 1){
				word = "one";
			}
			else if (num == 2){
				word = "two";
			}
			else if  (num == 3){
				word = "three";
			}
			else if (num == 4){
				word = "four";
			}
			else if (num == 5){
				word = "five";
			}
			else if (num == 6){
				word = "six";
			}
			else if (num == 7){
				word = "seven";
			}
			else if (num == 8){
				word = "eight";
			}
			else if (num == 9){
				word = "nine";
			}

			/*switch(num){
				case 0:
					word = "zero";
					break;
				case 1:
					word = "one";
							break;
				case 2:
					word = "two";
					break;
			}
			*/
	    System.out.println( "You entered " + word );
	}
}
