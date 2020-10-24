package view_control;
//control file sends user input to model
import util.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcControl extends JFrame {
    public static void main(String[] args) {
        CalculatorUI.button_1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_1.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_1.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_1.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_1.getText()));

        CalculatorUI.button_2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_2.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_2.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_2.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_2.getText()));

        CalculatorUI.button_3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_3.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_3.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_3.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_3.getText()));

        CalculatorUI.button_4.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_4.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_4.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_4.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_4.getText()));

        CalculatorUI.button_5.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_5.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_5.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_5.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_5.getText()));

        CalculatorUI.button_6.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_6.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_6.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_6.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_6.getText()));

        CalculatorUI.button_7.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_7.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_7.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_7.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_7.getText()));

        CalculatorUI.button_8.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_8.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_8.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_8.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_8.getText()));

        CalculatorUI.button_9.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_9.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_9.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_9.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_9.getText()));

        CalculatorUI.button_0.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_0.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_0.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_0.addActionListener(e -> CalcModel.updateCalcArea(CalculatorUI.button_0.getText()));

        CalculatorUI.button_plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_plus.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_plus.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_plus.addActionListener(e -> {
            CalcModel.saveValueOfArg1();
            CalcModel.saveValueOfMathOp(Math.OPERATOR.PLUS);
        });

        CalculatorUI.button_minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_minus.setBackground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_minus.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_minus.addActionListener(e -> {
            CalcModel.saveValueOfArg1();
            CalcModel.saveValueOfMathOp(Math.OPERATOR.MINUS);
        });

        CalculatorUI.button_equals.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_equals.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_equals.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_equals.addActionListener(e -> {
            CalcModel.saveValueOfArg2();
            CalcModel.calculateAnswer();
        });

        CalculatorUI.button_clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CalculatorUI.button_clear.setBackground(Color.PINK);
            }

            public void mouseReleased(MouseEvent e) {
                CalculatorUI.button_clear.setBackground(Color.PINK);
            }
        });
        CalculatorUI.button_clear.addActionListener(e -> CalcModel.clearCalculator());
    }
}
