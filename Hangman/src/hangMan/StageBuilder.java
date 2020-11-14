package hangMan;

public class StageBuilder {
	
	private String spacer="\t\t\t\t\t\t\t\t\t";
	

 public void topBar() {System.out.println("\n\t\t\t\t\t\t\t____________________"); }

 
 public void stageCreator() {
	System.out.print("\t\t\t\t\t\t\t||");System.out.println(" \t\t  \\\\");
	System.out.print("\t\t\t\t\t\t\t||"); System.out.println("\t\t   \\\\");
	System.out.print("\t\t\t\t\t\t\t||");System.out.println("\t\t    \\\\");
	System.out.print("\t\t\t\t\t\t\t||"); System.out.println("\t\t     \\\\");
	System.out.print("\t\t\t\t\t\t\t||"); System.out.println("\t\t      \\\\");
	}

public void head() {System.out.print("\t\t\t\t\t\t    ________");System.out.println("\t\t       \\\\");
	System.out.print("\t\t\t\t\t\t   /");System.out.print("\t    \\");System.out.println("\t\t\t\\\\");
	System.out.print("\t\t\t\t\t\t  /");System.out.print("\t     \\");System.out.println("\t\t\t \\\\");
	System.out.print("\t\t\t\t\t\t /");System.out.print("\t      \\");System.out.println("\t\t\t  \\\\");
	System.out.print("\t\t\t\t\t\t \\");System.out.print("\t      /");System.out.println("\t\t\t   \\\\");
	System.out.print("\t\t\t\t\t\t  \\");System.out.print("\t     /");System.out.println("\t\t\t   ||");
	System.out.print("\t\t\t\t\t\t   ===========");System.out.println("\t\t\t   ||");
	}

public void neck() {for (int i= 0; i<4; i++)
	System.out.println("\t\t\t\t\t\t\t|\t\t\t   ||");	
	}

public void arms() {System.out.print("\t\t\t\t\t     ______________________");System.out.println("\t\t   ||");	
	}

public void midSection2() {System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t //  \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t//    \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t       //      \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t      //        \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t     //          \\\\");	
	}

public void midSection1() {System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t //  \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t//    \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t       //      \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t      //        \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t     //          \\\\");
	}

public void makeLegSection2() {System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t //  \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t\t//    \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t       //      \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t      //        \\\\");
	System.out.print("\t\t\t\t\t\t\t|");System.out.println("\t\t     //          \\\\");	
	}
		
public void makeLegSection() {
		System.out.print("\t\t\t\t\t\t       / \\"); System.out.println("\t\t     ||\t\t  ||");
		System.out.print("\t\t\t\t\t\t      /   \\"); System.out.println("\t\t     ||\t\t  ||");
		System.out.print("\t\t\t\t\t\t     /     \\"); System.out.println("\t\t     ||\t\t  ||");
		System.out.print("\t\t\t\t\t\t    /       \\"); System.out.println("\t\t     ||\t\t  ||");
		System.out.print("\t\t\t\t\t\t   /         \\"); System.out.println("\t\t     ||\t\t  ||");
		System.out.print("\t\t\t\t\t\t  /           \\"); System.out.println("\t\t     ||\t\t  ||");
	}

public void makeStand1() {for (int i= 0; i<7; i++)
		System.out.println(spacer+"     ||\t\t  ||");
	}

public void makeBase2() {
		System.out.println("__________________________________________________________________________________________________________________________________________");
	}


public void makeSides() {
		for (int i= 0; i<6; i++)
		{System.out.println("||"); 
		System.out.println(spacer+"\t\t\t\t\t\t\t\t||");}
	}

public void makeBase1() {System.out.println("__________________________________________________________________________________________________________________________________________");
	}	

}
