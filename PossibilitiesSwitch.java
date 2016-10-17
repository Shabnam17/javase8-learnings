package conditionalstatements;

public class PossibilitiesSwitch {
	
public String generteRandomFish1(){
	String randomFish;

	int randomNumber = 0;

	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";
	   break;
	   case 1 : randomFish = "red fish";
	   break;
	   case 2 : randomFish = "green Fish";
	   break;
	   default : randomFish ="unknown fish type ";
	   break;
	}
	return randomFish;
	}


public String generteRandomFish2() {
	String randomFish;
	int randomNumber = 0;

	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";

	   case 1 : randomFish = "red fish";
	   break;
	   case 2 : randomFish = "green Fish";
	   break;
	   default : randomFish ="unknown fish type ";
	   break;
	}
	return randomFish;
	}

public String generteRandomFish3() {
	String randomFish;
	int randomNumber = 0;


	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";

	   case 1 : randomFish = "red fish";

	   case 2 : randomFish = "green Fish";
	   break;
	   default : randomFish ="unknown fish type ";
	   break;
	}
	return randomFish;
	}
public String generteRandomFish4() {
	String randomFish;
	int randomNumber = 0;


	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";

	   case 1 : randomFish = "red fish";

	   case 2 : randomFish = "green Fish";

	   default : randomFish ="unknown fish type ";
	   break;
	}
	return randomFish;
	}
public String generteRandomFish5() {
	String randomFish;
	int randomNumber = 0;

	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";

	   case 1 : randomFish = "red fish";

	   case 2 : randomFish = "green Fish";

	   default : randomFish ="unknown fish type ";

	}
	return randomFish;
	}

public String invalidCaseTakesInitialValueWithouDefaultKeywrd() {
	String randomFish=null; // compiler asks to set the initial value when "default" is removed
	int randomNumber = 7;

	System.out.println("random Number : "+randomNumber);
	switch(randomNumber){

	   case 0 : randomFish = "blue Fish";

	   case 1 : randomFish = "red fish";

	   case 2 : randomFish = "green Fish";

	}
	return randomFish;
	}

/**
 *  From Java SE7, String is allowed in the decision part 
 *  of switch statements
 * @return
 */
// private access modifier can also be used if required to access only from within class
private String stringDecision() {
	String randomFish;
	String fishMood = "happy Fish";

	System.out.println("fish type : "+fishMood);
	switch(fishMood){

	   case "happy Fish" : randomFish = "blue Fish";
        break;
	   case "sad Fish" : randomFish = "red fish";
	   break;
	   case "old Fish" : randomFish = "green Fish";
	   break;
	   default : randomFish = "invalid fish ";
	}
	return randomFish;
	}

private enum ClamBait{FRESH, SALTED, ARTIFICIAL};

private static void usingEnum() {

	ClamBait bait = ClamBait.SALTED;
	switch(bait){
	case FRESH: System.out.println(" FRESH ");
	break;
	case SALTED: System.out.println(" SALTED ");
	break;
	case ARTIFICIAL: System.out.println(" ARTIFICIAL ");
	break;
	default : System.out.println("INVALID TYPE ");
	}

}


public static void main(String args[]){
	PossibilitiesSwitch obj = new PossibilitiesSwitch();
	System.out.println(obj.generteRandomFish1());
	System.out.println(obj.generteRandomFish2());
	System.out.println(obj.generteRandomFish3());
	System.out.println(obj.generteRandomFish4());
	System.out.println(obj.generteRandomFish5());
	System.out.println(obj.invalidCaseTakesInitialValueWithouDefaultKeywrd());
	System.out.println(obj.stringDecision());
    usingEnum();
}

}
