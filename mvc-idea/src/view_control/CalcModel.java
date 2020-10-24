package view_control;
//model does the math and calculator function and sends the answer back to the view file to be displayed
import util.Math;

import javax.swing.*;

public class CalcModel extends JFrame {
    public static double calcAnswer;
    public static void calculateAnswer()  // method to perform calculation
    {
        calcAnswer = util.Math.calculateIt(CalculatorUI.arg1, CalculatorUI.mathOp, CalculatorUI.arg2);
        CalculatorUI.arg1 = Double.parseDouble(CalculatorUI.calcArea.getText());
        CalculatorUI.mathState = CalculatorUI.STATE.CALC;
        CalculatorUI.initialCalcAreaInputState = true;
        CalculatorUI.displayAnswer(calcAnswer); //sends answer back to view
    }

    public static void updateCalcArea(String string) {
        if (CalculatorUI.initialCalcAreaInputState) {  // sets text to string on initial key typed
            CalculatorUI.calcArea.setText(string);
            CalculatorUI.initialCalcAreaInputState = false;
        } else { // concatenates string to end of text subsequent keys typed
            CalculatorUI.calcArea.setText(CalculatorUI.calcArea.getText() + string);
        }
    }

    /**
     * Save values for Calculator.
     */
    public static void saveValueOfArg1() { // method to store 1st value in calculation (CalculatorUI.arg1)
        CalculatorUI.arg1 = Double.parseDouble((CalculatorUI.calcArea.getText()));
        CalculatorUI.mathState = CalculatorUI.STATE.SAVE1;
        CalculatorUI.initialCalcAreaInputState = true;
    }

    public static void saveValueOfArg2() { // method to store 2nd value in calculation (CalculatorUI.arg2)
        if (CalculatorUI.mathState != CalculatorUI.STATE.CALC) {
            CalculatorUI.arg2 = Double.parseDouble((CalculatorUI.calcArea.getText()));
            CalculatorUI.mathState = CalculatorUI.STATE.SAVE2;
        }
    }

    public static void saveValueOfMathOp(Math.OPERATOR op) { // method to store operator
        CalculatorUI.mathOp = op;
    }

    public static void clearCalculator() {  // helper method to clear and update calculator to default
        // calculator control
        String calcAreaDefault = "0.0";
        CalculatorUI.calcArea.setText(calcAreaDefault);
        CalculatorUI.mathState = CalculatorUI.STATE.INITIAL;
        CalculatorUI.initialCalcAreaInputState = true;
        CalculatorUI.arg1 = 0.0;
        CalculatorUI.arg2 = 0.0;
        calcAnswer = 0.0;
    }
}
