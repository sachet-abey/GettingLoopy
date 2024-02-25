import java.util.Scanner; // Import Scanner from Java
public class Tasks {
    public static void main(String[] args) {
        for(int i = 0; i <= 30; i++) { // For loop with start 0, end 30, and step 1 (increasing)
            System.out.println(i);
        }
        for(int i = 30; i >= 0; i--) { // For loop with start 30, end 0, and step -1 (decreasing)
            System.out.println(i);
        }
        for(int i = 0; i <= 18; i += 3) { // For loop with start 0, end 18, and step 3
            System.out.println(i);
        }
        for(int i = 10; i >= 0; i -= 2) { // For loop with start 10, end 0, and step -2
            System.out.println(i);
        }
        for(int i = 1; i <= 5; i++) { // For loop with start 1, end 5, and step 1
            for(int j = 1; j <= i; j++) { // For loop with start 1, end i, and step 1
                System.out.print("*"); // Print an asterisk *
            }
            System.out.println(""); // Create a newline
        }
        for(int i = 1; i <= 5; i++) { // For loop with start 1, end 5, and step 1
            for(int j = 5; j >= i; j--) { // For loop with start 5, end i, and step -1
                System.out.print("*"); // Print an asterisk *
            }
            System.out.println(""); // Create a newline
        }
        for(int i = 1; i <= 5; i++) { // For loop with start 1, end 5, and step 1 (for each row)
            for(int j = 1; j <= 5; j++) { // For loop with start 1, end 5, and step 1 (for each column)
                System.out.print("*"); // Print an asterisk *
            }
            System.out.println(""); // Create a newline
        }
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        String type; // Define a type variable to store the temperature type that the user will be giving
        String trash; // Define a trash variable for any invalid user input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        double temperature = 0; // Initialize temperature variable for user input
        do {
            System.out.println("What type of temperature will you be inputting? (F or C)"); // Prompts user to tell what temperature type they will be giving
            type = scan.nextLine(); // Retrieves user input as a string
            if(type.equals("F") || type.equals("C")) { // If the user has entered a valid input (F or C)
                done = true; // Set done to true to end the do-while loop because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                System.out.println("You entered "+type+". Please enter a valid input!"); // Outputs the invalid input and asks user to enter a valid input
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        done = false; // Sets done to true for next do-while loop
        do {
            System.out.println("Enter a temperature value: "); // Prompts user to enter a temperature value
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                temperature = scan.nextDouble(); // Read temperature value because valid input
                scan.nextLine(); // Clear the newline from the buffer
                done = true;  // Set done to true to end the do-while loop because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid temperature value!"); // Outputs the invalid input and asks user to enter a valid temperature value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        if(type.equals("F")) { // If the temperature type is fahrenheit
            double celsius = (temperature - 32) * 5/9; // Convert from fahrenheit to celsius using Java's arithmetic operators
            System.out.println("This temperature in fahrenheit converted to celsius is "+celsius); // Output calculations/results of the conversion
        }
        else { // Otherwise (if the temperature type is celsius)
            double fahrenheit = 1.8 * temperature + 32; // Convert from celsius to fahrenheit using Java's arithmetic operators
            System.out.println("This temperature in celsius converted to fahrenheit is "+fahrenheit); // Output calculations/results of the conversion
        }
        for(int i = 1; i <= 2; i++) { // For loop with start 1, end 2, and step 1
            System.out.println("***************");
        }
        for(int i = 1; i <= 2; i++) { // For loop with start 1, end 2, and step 1
            System.out.println("***");
        }
        for(int i = 1; i <= 2; i++) { // For loop with start 1, end 2, and step 1
            System.out.println("***************");
        }
        for(int i = 1; i <= 2; i++) { // For loop with start 1, end 2, and step 1
            System.out.println("            ***");
        }
        for(int i = 1; i <= 2; i++) { // For loop with start 1, end 2, and step 1
            System.out.println("***************");
        }
    }
}