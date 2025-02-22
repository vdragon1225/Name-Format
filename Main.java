import java.util.Scanner; // import the Scanner class

public class Main {
   public static void main(String[] args) {
      // Declare scanner object
      Scanner scan = new Scanner(System.in);

      // Prompt user for input
      System.out.print("Enter a name: ");
      String name = scan.nextLine();

      // Find the first space
      int firstSpace = name.indexOf(' ');

      // Find the second space
      int secondSpace = name.indexOf(' ', firstSpace + 1);

      // Declare empty strings for last name, first name, and middle name
      String lastName = "";
      String firstName = "";
      String middleName = "";

      // find the last name
      if (secondSpace != -1) {
        // use a substring and set lastName equal to text after second space
        lastName = name.substring(secondSpace + 1);
        firstName = name.substring(0, firstSpace);
        middleName = name.substring(firstSpace + 1, secondSpace);
      }
      else {
        // use a substring and set lastName equal to text after first space
        lastName = name.substring(firstSpace + 1);
        firstName = name.substring(0, firstSpace);
      }

      // Print the last name, first initial, and middle initial
      if (!(middleName.equals(""))) { // if middle name is not empty
        System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
      }
      else {
        System.out.println(lastName + ", " + firstName.charAt(0) + ".");
      }

      // Close scanner object
      scan.close();
   }
}
