package view_control;
import java.util.Scanner;

public class CalculatorTextUI {
    public static boolean valid = true;
    public static String operator = null;
    static boolean calculateAgain = false;
    public static String input;
    static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            askNumber();
        } while (!calculateAgain); //keeps repeating until user decides to end program
    }

    public static void askNumber() {
        do {
            System.out.println("Please enter a number between 0 and 9");
            input = user.nextLine();
            try {
                int testInt = Integer.parseInt(input); //checks if user input was a number
            } catch (NumberFormatException nfe) {
                valid = false;    //what to do if user input was not a string
            }

            if (valid) { //if the user entered a number
                askOperator(); //proceed to prompt for operator
            }

            if (!operator.equals(null)) { //check if this is the second number entered -> part that calculates the answer
                CalcModel.saveValueOfArg2(Double.parseDouble(input)); //sets CalculatorUI.Arg2 to input via model
                CalcModel.calculateAnswer(); //uses same functions in model as the jframe ui; so each model supports multiple uis
                //this is the point of mvc
                //even the variables used are the same: the savevalueofarg functions from model save the user input from both jframe and text into model
                //print answer
                boolean repeatValid = false;
                do {
                    //ask user if they want to calculate again (ask them to answer y or n)
                    //if input is y
                    calculateAgain = true; //will repeat the entire program in main()
                    repeatValid = true;
                    //else if input is n
                    calculateAgain = false; //ends the program
                    repeatValid = true;
                } while (!repeatValid); //in case user enters something other than y or n: will keep prompting to try again
            }
        } while (!valid); //keeps asking user to enter a number until a valid number is entered
    }

    public static void askOperator() {
        do {
            System.out.println("Would you like to +, -, *, or / ?");
            valid = false;
            String operator = null;
            operator = user.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                CalcModel.saveValueOfArg1(Double.parseDouble(input)); //sets CalculatorUI.Arg1 to input via model
                //input from previous value entered; passes data to the model that works regardless of JFrame or text ui as they both use the functions found in model; just the variable names are different in the different ui's
                askNumber();
                valid = true;
            }
        } while (!valid);
    }
}