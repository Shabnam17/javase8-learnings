package stringLearning;

public class StringLearn {
	// Object of String Class >> immutable character string
    
    // Object of StringBuilder Class >> mutable character string
    // Object of StringBuffer Class >> thread safe mutable character string
    private String owner = "JK Rowling";
    private String book = "HarryPotter";
    private String message = "  Burried Treasure Chest! ";
    public char charAt(int index){
           try{
           return message.charAt(index);
           }catch(Exception e){
                  System.out.println("Error : "+e);
           }
           return 0;
    }
    public int indexOf(char ch){
           return message.indexOf(ch);
    }
    public int indexOf(char ch, int fromIndex){
           try{
           return message.indexOf(ch,fromIndex);
           }catch(Exception e){
                  return -1;
           }
           
    }
    public String toString(){
           return this.owner+" is the author of "+this.book;
    }
    
    // Methods of String Builder Class
    // append, insert, delete, deleteCharAt, and reverse
    
    // APPEND METHOD
    //The StringBuilder class’s append method appends the supplied data as a character string.
    
    public StringBuilder appendString(){
           StringBuilder mateyMessage;
           mateyMessage =new StringBuilder("Shivers!");
    mateyMessage.append(" Bad Storm!");
           return mateyMessage;
           
    }
    
    public StringBuilder appendAllThese(){
           StringBuilder e = new StringBuilder("Examples:");
           e.append(" ").append("1"); //String
           e.append(" ").append(new StringBuffer("2"));
           e.append(" ").append('\u0031');//Char
           e.append(" ").append((int)2);//int
           e.append(" ").append(1L);//long
           e.append(" ").append(2F);//float
           e.append(" ").append(1D);//double
           e.append(" ").append(true);//true
           return e;
           
    }
    
    //INSERT METHOD
    //The StringBuilder class’s insert method inserts the string representation of the supplied data starting at the specified location.
    
    public StringBuilder insertString(){
           StringBuilder mateyMessage;
           mateyMessage =new StringBuilder("Shiver me Timbers!");
    mateyMessage.insert(17, " and Bricks!");
           return mateyMessage;
           
    }
    
    //DELETE METHOD
    //The StringBuilder class’s delete method removes characters in a substring of the StringBuilder object.
    //The substring begins with the value in the start argument and ends with the end - 1 argument.

    
    public StringBuilder deleteString(int start, int end){
           StringBuilder mateyMessage;
           mateyMessage =new StringBuilder("Shiver me Timbers!");
    mateyMessage.delete(start,end);
           return mateyMessage;
    }
    
    //DELETE CHAR AT
    public StringBuilder deleteCharacterAt(int ch){
           StringBuilder mateyMessage;
           mateyMessage =new StringBuilder("Shiver me Timbers!");
    mateyMessage.deleteCharAt(ch);
           return mateyMessage;
    }
    
    //REVERSE METHOD
    //The StringBuilder class’s reverse method reverses the order of the character sequence.
    
    public String reverseString(String torev){
           StringBuilder r = new StringBuilder(torev);
           return "It is a "+r.reverse()+"!";
    }
    
    //Using Constructors of the StringBuilder Class
    
public static void main(String[] args){

    StringLearn obj = new StringLearn();
    System.out.println(obj);
    String hgy="Oranges are red in color";
    System.out.println("Real string after replacing : "+hgy.replace("red", "orange"));
    System.out.println("Shows strings are immutable : "+hgy);
    String item = "doubloon";
    String question = "What is a "+item+"?";
    //Usage of charAt
    System.out.println(question);
    System.out.println("Value of charAt(0) of the string \"  Burried Treasure Chest! \" is "+obj.charAt(0));
    System.out.println("Value of charAt(2) of the string \"  Burried Treasure Chest! \" is "+obj.charAt(2));
    System.out.println("Value of charAt(23) of the string \"  Burried Treasure Chest! \" is "+obj.charAt(23));
    System.out.println("Value of charAt(211) of the string \"  Burried Treasure Chest! \" is "+obj.charAt(211));
    
    String quote = "No pain no gain";
    //IndexOf usage
    System.out.println("Index of o from index 2 in \"No pain no gain\" "+quote.indexOf('o',2));
 //Length() usage
    System.out.println("Length of 'No pain No gain' is "+quote.length());
  //.concat() usage
    System.out.println(("Blood is thicker than").concat(" water"));
    //replace method
    System.out.println(("Jurried Treasure").replace('J', 'B'));
    System.out.println(("Burried Treasure").replace("Treasure", "Talents"));
    //starts with
    String obj1 = "Humpty Dumpty sat on a wall ";
    System.out.println((obj1).startsWith("Humpty"));
    System.out.println((obj1).startsWith("pty",3));
    System.out.println((obj1).endsWith("Enjoy"));
    System.out.println((obj1).endsWith(" wall"));
    System.out.println((obj1).substring(7, 13));
    System.out.println(("INDIA").toLowerCase());
    System.out.println(("india").toUpperCase());
    System.out.println(("india").equalsIgnoreCase("INdIa"));
    System.out.println(("    Removing Spaces  ").trim());
    
    System.out.println(" Appending String Using String Builder ");
    System.out.println(obj.appendString());
    System.out.println(obj.appendAllThese());
    System.out.println("Inserting new String");
    System.out.println(obj.insertString());
    System.out.println("Deleting a specified portion of string");
    System.out.println(obj.deleteString(6,16));
    System.out.println("Deleting a specified char of string");
    System.out.println(obj.deleteCharacterAt(17));
    System.out.println(obj.reverseString("part"));
}      

}
