package view_control;
import util.Math;

import java.util.Scanner;

public class CalculatorTextUI {
    public static boolean valid = true;
    public static String operator = "null";
    public static String input = null;
    static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {
        operator = "null";
        askNumber();
    }

    public static void askNumber() {
        do {
            System.out.println("Please enter a number between 0 and 9");
            input = user.nextLine();
            valid = true;
            try {
                double testInt = Double.parseDouble(input); //checks if user input was a number
            } catch (NumberFormatException nfe) {
                valid = false;    //what to do if user input was not a string
            }

            if (valid && operator.equals("null")) { //if the user entered a number and this is the first number entered
                askOperator(); //proceed to prompt for operator
            }

            if (valid && !operator.equals("null")) { //check if this is the second number entered -> part that calculates the answer
                CalcModel.saveValueOfArg2(Double.parseDouble(input)); //sets CalculatorUI.Arg2 to input via model
                CalcModel.calculateAnswer(); //calculates answer and stores it in CalcModel.calAnswer variable
                //this is the point of mvc
                //even the variables used are the same: the savevalueofarg functions from model save the user input from both jframe and text into model
                System.out.println(CalcModel.calcAnswer); //uses same functions in model as the jframe ui; so each model supports multiple uis
                boolean repeatValid = false;
                do {
                    System.out.println("Would you like to calculate again? (y/n)");
                    input = user.nextLine();
                    if (input.toLowerCase().equals("y")) {
                        repeatValid = true;
                        main(null); //repeats the entire program
                    } else if (input.toLowerCase().equals("n")) {
                        repeatValid = true;
                        System.exit(0); //ends the program
                    } else {
                        System.out.println("Please enter y/n:");
                    }
                } while (!repeatValid); //in case user enters something other than y or n: will keep prompting to try again
            }
        } while (!valid); //keeps asking user to enter a number until a valid number is entered
    }

    public static void askOperator() {
        do {
            System.out.println("Would you like to +, -, *, or / ?");
            valid = false;
            operator = user.nextLine();

            if (operator.equals("+")) {
                CalcModel.saveValueOfArg1(Double.parseDouble(input)); //sets CalculatorUI.Arg1 to input via model
                CalcModel.saveValueOfMathOp(Math.OPERATOR.PLUS);
                //input from previous value entered; passes data to the model that works regardless of JFrame or text ui as they both use the functions found in model; just the variable names are different in the different ui's
                askNumber();
                valid = true;
            } else if (operator.equals("-")) {
                CalcModel.saveValueOfArg1(Double.parseDouble(input)); //sets CalculatorUI.Arg1 to input via model
                CalcModel.saveValueOfMathOp(Math.OPERATOR.MINUS);
                askNumber();
                valid = true;
            } else if (operator.equals("*")) {
                CalcModel.saveValueOfArg1(Double.parseDouble(input)); //sets CalculatorUI.Arg1 to input via model
                CalcModel.saveValueOfMathOp(Math.OPERATOR.MULTIPLY);
                askNumber();
                valid = true;
            } else if (operator.equals("/")) {
                CalcModel.saveValueOfArg1(Double.parseDouble(input)); //sets CalculatorUI.Arg1 to input via model
                CalcModel.saveValueOfMathOp(Math.OPERATOR.DIVIDE);
                askNumber();
                valid = true;
            }
        } while (!valid);
    }
}
