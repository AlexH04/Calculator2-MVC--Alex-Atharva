package view_control;

import util.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcControl extends JFrame {
        CalculatorUI.button_1.addActionListener(e -> CalcModel.updateCalcArea(button_1.getText()));
}
