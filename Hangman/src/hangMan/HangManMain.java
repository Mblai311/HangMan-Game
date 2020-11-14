package hangMan;
import java.util.Scanner;

public class HangManMain {

public static void main(String[] args) {     ///////PLAN: MAKE EXCEPTION FOR TYPING '>'.    **LEARN HOW TO CLOSE SCANNER PROPERLY!!!!** 
		
		HangManMain redo= new HangManMain();
		HangmanMethodClass hango= new HangmanMethodClass();
		Scanner scanny= new Scanner(System.in);              ///////**WHAT DOES IT MEAN SCANNY IS NOT CLOSED??**
  
		boolean running= true;  

  do {
    		hango.game(); 
    		
    		System.out.println("\n\n\n\n\n\t\t\t\t?????????????????????????????????  Do you wanna play again  ?????????????????????????????????\n\t\t\t\t\t\t\t\t\t     ???");
    		System.out.println("\n\t\t\t\t\t\t\t\t   Type \"YES\"   or   Type \"NO\"");
    			
    		String input = scanny.nextLine().toLowerCase().trim();   ///////**IS THIS THE BEST PLACE TO OPEN SCANNER???**

    	if (input.equals("yes"))  { redo.main(args); }											//
    		
    	else if  (input.equals("no")) {
    			System.out.println("\n\n\n\n\t\t\t\t\t\t\t\t Thank you for Playing Goodbye!!!"); 
    		System.exit(0);;} else {System.out.println("n\t\t\t\t\t\t\t\t THAT IS THE WRONG INPUT!!! ");}  
    }	while (running);	scanny.close();																		//

}
}
