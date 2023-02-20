import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    	double meters = 0;
	 	double miles = 0;
	 	double feet = 0;
	 	double inches = 0;
	 	String trash = "";

		Scanner in = new Scanner(System.in); // Creates new scanner and tells it to read from console

		System.out.print("Please enter the measurement in meters: "); // prompt
		if (in.hasNextDouble()) // if the input is valid then the code in the if block will execute
		{
			meters = in.nextDouble(); // if the input is a valid number, then the value will be stored
			in.nextLine(); // clears the buffer

			miles = meters / 1609.344; // calculates miles by dividing meters by 1609.344
			feet = meters * 3.28; // calculates measurement in feet by multiplying meters by 3.28
			inches = meters * 39.37; // calculates measurement in inches by multiplying meters by 39.36

			System.out.println("The equivalent measurement in miles is " + miles);
			System.out.println("The equivalent measurement in feet is " + feet);
			System.out.println("The equivalent measurement in inches is " + inches);
		}
		else // if the input is invalid, the else block will run
		{
			trash = in.nextLine(); // invalid response is stored
			System.out.println("Must enter a valid measurement: " + trash); // output tells the user that input was invalid and echoes the response
		}

    }
}
