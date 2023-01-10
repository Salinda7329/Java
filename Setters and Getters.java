// Import the Scanner class
import java.util.Scanner;  


// Create the person class
class Person {

    //Create private variable
    private String name;

    //Create setter
    public void setName(String Name){
        this.name=Name;
    };

    //Create getter
    public String getName(){
        return this.name;
    };

      //Create the main method
  public static void main(String[] args) {
  
    //Create an Object from Person class
    Person newPerson=new Person();

    // Create a Scanner object for user input
    Scanner userInput = new Scanner(System.in); 

    System.out.println("Enter your name:");
    // add name to the variable name of newPerson
    newPerson.name=userInput.nextLine();

    // print name of newPerson
    System.out.println("My Name Is,");  
    System.out.println(newPerson.name);  
  }
}
