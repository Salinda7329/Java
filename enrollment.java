// Import the Scanner class
import java.util.Scanner;  
// Import ArrayList class
import java.util.ArrayList;


// Create the enrollment class
class enrollment {

      //Create the main method
  public static void main(String[] args) {

    //Create an ArrayList of Object type
    ArrayList<Object> details = new ArrayList<Object>();

    // Create a Scanner object for major
    Scanner user = new Scanner(System.in); 

    System.out.println("Enter your major:");
    // add major to the array
    details.add(user.nextLine()); 

    System.out.println("Enter your Country:");
    // add country to the array
    details.add(user.nextLine());  

    System.out.println("Enter your age:");
    // add age to the array
    details.add(user.nextLine());  
    System.out.println("Enter your graduation year:");
    // add graduation year to the array
    details.add(user.nextLine()); 

    // print all details
    System.out.println(details);  
  }
}
