package hangMan;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanMethodClass {

	int rightChoiceCounter=0;
	int numChances=11;
	byte stageSize=0;
	static int winCounter;
	
	static final Scanner scanny= new Scanner(System.in);    /////**I DONT KNOW WHY I DID THIS(STATIC AND FINAL) I MUST FIND OUT!! SHOULD I HAVE DONE IT MORE???* 
	StageBuilder classo= new StageBuilder();
	Random rand= new Random();
	
	ArrayList<String> letterFound= new ArrayList<String>();
	ArrayList<String>lettersTheyEnter= new ArrayList<String>();					////////MAYBE CAPITALIZE THE FIRSE LETTER OF EACH WORD SO IT LOOKS A LITTLE BETTER???
	ArrayList<String> listOfWords= new ArrayList<String>(Arrays.asList("donkey","astronaut","spaghetti","hamster","government","phantom","guilty","naughty","monkey","horses","apples","banana","africa","heaven","silver","monday","father","london","breeze",
																		"penguin","basket","poster","tables","squirrel","pepperoni","meatball","testicle","tuesday","wednesday","hurricane","tornado","office","eleven","peasant","turtle","secret,","energy",
																		"painting","fetish","guitar","honour","triangle","rectangle","pillow","heroine","ecstasy","pleasure","derived","deprived","coding","hungry","pleasant","coffee","pirate","sister",
																		"eating","reptile","exhaust","heater","stretch","agents","brother","canada","america","britain","russia","memory","ending","forest","friend","tomato","beaver","healthy","beauty"));
	String randomListOfWords= listOfWords.get(rand.nextInt(listOfWords.size()));
	
	String[] randomWordChoice={randomListOfWords}; 		
	String[] correctLetterFound= new String[randomListOfWords.length()+1];
	char[] characterArray= new char[randomListOfWords.length()+1];
	
    String randomWordString= Arrays.toString(randomWordChoice);


public void makingMethod() {
																/////////THIS FEELS LIKE A WEIRD BIT OF CODE
	if( numChances==10) {classo.topBar();}
	else if( numChances==9) {classo.topBar();classo.stageCreator();	}
	else if( numChances==8) {classo.topBar();classo.stageCreator();classo.head(); }
	else if( numChances==7) {classo.topBar();classo.stageCreator();classo.head();classo.arms(); }
	else if( numChances==6) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck(); }
	else if( numChances==5) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2(); }
	else if( numChances==4) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2();classo.makeLegSection();	}
	else if( numChances==3) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2();classo.makeLegSection();classo.makeStand1(); }
	else if( numChances==2) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2();classo.makeLegSection();classo.makeStand1();classo.makeBase1(); }
	else if( numChances==1) {classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2();classo.makeLegSection();classo.makeStand1();classo.makeBase1();classo.makeSides(); }
	else if( numChances==0) {System.out.println("\n\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!YOU LOSE BITCH!!!!!!!!!!!!!!!!!!!!!!!!!YOU LOSE BITCH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
							 classo.topBar();classo.stageCreator();classo.head();classo.arms();classo.neck();classo.makeLegSection2();classo.makeLegSection();classo.makeStand1();classo.makeBase1();classo.makeSides();classo.makeBase2();
							 System.out.println("\n\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!YOU LOSE BITCH!!!!!!!!!!!!!!!!!!!!!!!!!YOU LOSE BITCH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
							 System.out.println("\t\t\t      I'm sorry, you lost, please try agian! The word you were looking for was...  "+Arrays.toString(randomWordChoice));
							 System.out.println("\t\t\t\tGOODBYE!!! :)");  return;  }
		
							}

public void choice() {
	String myLetter=new String(correctLetterFound[rightChoiceCounter]);	
for (int z=1; z<Arrays.toString(randomWordChoice).length(); z++) {
if (myLetter.charAt(0)==randomWordString.charAt(z)){ characterArray[z]=randomWordString.charAt(z); }
}
	}     
	
public void game() {
	
		for (int k=0; k<randomListOfWords.length()+1; k++) correctLetterFound[k]=" ";	
		for (int k=0; k<randomListOfWords.length()+1; k++) characterArray[k]='-';	
		
		//characterArray[0]='>';
		
			System.out.println("=================================================================================================================================================");
			System.out.println("\t\t\t\t\t\tHello and welcome to the fabulous game of Hangman!!\n");
			System.out.println("\t\t\t\t\t     Can you save our swashbucklin' old chap from certain doom??!!!");
			System.out.println("=================================================================================================================================================");
	
while (numChances>0){      
		 
			System.out.println("\n\t  Your word is... "+randomListOfWords.length()+"  ...characters long\n"); 
			System.out.print( "\n\t\t\t\t\t    GUESSES... "+ Arrays.toString(letterFound.toArray())+"\t\t\t\tCORRECT GUESSES..."); System.out.println(characterArray);
			System.out.println("\n\n\nPlease guess a letter or solve if you can...\n\n");
//ANSWER:		System.out.println(Arrays.toString(randomWordChoice)+" IS THE ANSWER YOU CHEATER!!!");          ///////////// PLAN: MAKE A CHEAT BUTTON OPTION AT THE MENU BEFORE YOU START THE GAME
		
		String input =scanny.next().toLowerCase().trim();		
		
		boolean rightChoice= Arrays.toString(randomWordChoice).contains(input);
		boolean wrongChoice= !Arrays.toString(randomWordChoice).contains(input);
		boolean alreadyBeenGuessed= letterFound.contains(input);                    
		boolean alreadyBeenGuessedRight=  false; 																								
			
	for (int i = 0; i < randomListOfWords.length(); i++)
		if (input.equals(correctLetterFound[i])) alreadyBeenGuessedRight=true;  {

		if	(alreadyBeenGuessedRight||alreadyBeenGuessed) {  
			System.out.println("\n\n\n\n!!!---------------------------------------------------!!!   YOU ALREADY TRIED THAT LETTER  !!!---------------------------------------------------!!!\n\t\t\t\t\t\t\t\t  :P YOU GOOMBA!!! :P\n\n\n"); }
		
		else if (rightChoice) { 
			try {    correctLetterFound[rightChoiceCounter]= input; choice(); rightChoiceCounter+=1;
			System.out.println("\n\n\n\n!!!----------------------------------------------------!!!   Conratulations that was right!  !!!-------------------------------------------------!!!\n\t\t\t\t\t\t\t\t   :D YOU ROCK!!! :D\n\n\n"); } 
		
			catch(ArrayIndexOutOfBoundsException e){System.out.println("\n\n\t\t\t\t\t\t        YOU GUESSED TOO MUCH STUPID STUFF!!!!");return;}}
	
		else if (wrongChoice) { 
			letterFound.add(input); 
			System.out.println("\n\n\n\n!!!-------------------------------!!!   I'm sorry you were wrong... Our lad is one step closer to death...  !!!----------------------------------!!!"); numChances-=1;; }
	
	makingMethod();	
			System.out.println("\n\t\t\t\t\t\t"+"\tOnly "+numChances+" chance(s) left before the lad is is dead!!!\n");
			
		if (input.length()>=2) { 
			System.out.print("\n\n\n\t  ***You take yer try at solving the Puzzle!!!..."); 
					
			 if( input.length()==randomListOfWords.length()&&Arrays.toString(randomWordChoice).contains(input)) {winCounter+=1; 
			 System.out.println("\n\n\n!!!*******************************************************!!!  YOU SOLVED THE PUZZLE!!! OUR LAD GOES FREE  !!!******************************************!!!\n\t\t\t\t\t\t\t\t\t   You've won "+winCounter+" :D games(s)\n\n\n"); 
				return;}
				
			else {System.out.println("  But that is not correct! Please enter another Letter or try and solve the Puzzle!***\n"); rightChoiceCounter-=1;}; }
					
	
	}  
}
}}
