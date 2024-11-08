
public class SwitchExpression {
public static void main(String args[])
{
	import java.util.Scanner;

	public class DayLetterCount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a day of the week: ");
	        String day = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison

	        int letterCount;

	        // Switch case to determine the number of letters
	        switch (day) {
	            case "monday":
	                letterCount = 6;
	                break;
	            case "tuesday":
	                letterCount = 7;
	                break;
	            case "wednesday":
	                letterCount = 9;
	                break;
	            case "thursday":
	                letterCount = 8;
	                break;
	            case "friday":
	                letterCount = 6;
	                break;
	            case "saturday":
	                letterCount = 8;
	                break;
	            case "sunday":
	                letterCount = 6;
	                break;
	            default:
	                letterCount = -1; // Invalid day
	                break;
	        }

	        if (letterCount == -1) {
	            System.out.println("Invalid day entered.");
	        } else {
	            System.out.println("The number of letters in " + day + " is: " + letterCount);
	        }

	        scanner.close();
	    }
	}

}
