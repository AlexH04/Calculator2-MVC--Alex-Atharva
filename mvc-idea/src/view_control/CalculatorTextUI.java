package view_control;
import java.util.Scanner;

public class CalculatorTextUI {
    //public static boolean valid = true;
    //public static String operator = null;
    static boolean calculateAgain = false;

    public static void main(String[] args) {
        do {
            askNumber();
        } while (!calculateAgain); //keeps repeating until user decides to end program
    }
    /*public static void askNumber() {
        do {
            System.out.println prompt the user to enter a number from 0-9
            Scanner user = new Scanner(System.in);
            String input = user.nextLine();
            try {
                int testInt = Integer.parseInt(input); //checks if user input was a number
            } catch (NumberFormatException nfe) {
                valid = false;    //what to do if user input was not a string
            }

            if (valid) { //if the user entered a number
                askOperator(); //proceed to prompt for operator
            }

            if (!operator.equals(null)) { /check if this is the second number entered -> part that calculates the answer
                CalcModel.saveValueOfArg2(input); //sets CalculatorUI.Arg2 to input via model
                CalcModel.calculateAnswer; //uses same functions in model as the jframe ui; so each model supports multiple uis
                //this is the point of mvc
                //even the variables used are the same: the savevalueofarg functions from model save the user input from both jframe and text into model
                print answer
                boolean repeatValid = false;
                do {
                    ask user if they want to calculate again (ask them to answer y or n)
                    if input is y
                        calculateAgain = true; //will repeat the entire program in main()
                        repeatValid = true;
                    else if input is n
                        calculateAgain = false; //ends the program
                        repeatValid = true;
                } while (!repeatValid); //in case user enters something other than y or n: will keep prompting to try again
        } while (!input) //keeps asking user to enter a number until a valid number is entered
    }

    public static void askOperator() {
        do {
            prompt user for +. -, * or /
            valid = false;
            store the operator in the operator string
            if input is +, -, * or /:
                CalcModel.saveValueOfArg1(input); /sets CalculatorUI.Arg1 to input via model
                //input from previous value entered; passes data to the model that works regardless of jframe or text ui as they both use the functions found in model; just the variable names are different in the different uius
                then call asknumber() again for the second number
                valid = true;
            } while valid is false
     */
}
