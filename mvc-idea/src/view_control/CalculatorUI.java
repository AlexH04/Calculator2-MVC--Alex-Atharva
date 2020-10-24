package view_control;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import util.Math.OPERATOR;

public class CalculatorUI extends JFrame {
	public static final JLabel calcArea = new JLabel("");

	public static boolean initialCalcAreaInputState;
	public static enum STATE { INITIAL, SAVE1, SAVE2, CALC }

	public static STATE mathState;
	
	// calculator values
    public static OPERATOR mathOp;
	public static double arg1;
    public static double arg2;
    public static double calcAnswer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				CalculatorUI frame = new CalculatorUI();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public static JButton button_1 = new JButton("1");
	public static JButton button_2 = new JButton("2");
	public static JButton button_3 = new JButton("3");
	public static JButton button_4 = new JButton("4");
	public static JButton button_5 = new JButton("5");
	public static JButton button_6 = new JButton("6");
	public static JButton button_7 = new JButton("7");
	public static JButton button_8 = new JButton("8");
	public static JButton button_9 = new JButton("9");
	public static JButton button_0 = new JButton("0");
	public static JButton button_plus = new JButton("+");
	public static JButton button_minus = new JButton("-");
	public static JButton button_equals = new JButton("=");
	public static JButton button_clear = new JButton("AC");

	/**
	 * Create the frame.
	 */
	public CalculatorUI() {
		getContentPane().setBackground(new Color(175, 238, 238));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 418, 315);
		getContentPane().setLayout(null);
		calcArea.setForeground(Color.WHITE);
		calcArea.setFont(new Font("Lucida Grande", Font.PLAIN, 72));
		calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
		calcArea.setBounds(18, 6, 377, 67);
		getContentPane().add(calcArea);
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_1.setBackground(Color.PINK);
			}
		});
		button_1.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.PINK);
		button_1.setBounds(35, 86, 75, 40);
		getContentPane().add(button_1);
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_2.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_2.setBackground(Color.PINK);
			}
		});
		button_2.addActionListener(e -> CalcModel.updateCalcArea(button_2.getText()));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_2.setBackground(Color.PINK);
		button_2.setBounds(122, 86, 75, 40);
		getContentPane().add(button_2);
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_3.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_3.setBackground(Color.PINK);
			}
		});
		button_3.addActionListener(e -> CalcModel.updateCalcArea(button_3.getText()));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_3.setBackground(Color.PINK);
		button_3.setBounds(209, 86, 75, 40);
		getContentPane().add(button_3);
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_4.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_4.setBackground(Color.PINK);
			}
		});
		button_4.addActionListener(e -> CalcModel.updateCalcArea(button_4.getText()));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_4.setBackground(Color.PINK);
		button_4.setBounds(35, 138, 75, 40);
		getContentPane().add(button_4);
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_5.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_5.setBackground(Color.PINK);
			}
		});
		button_5.addActionListener(e -> CalcModel.updateCalcArea(button_5.getText()));
		button_5.setOpaque(true);
		button_5.setForeground(Color.WHITE);
		button_5.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_5.setBackground(Color.PINK);
		button_5.setBounds(122, 138, 75, 40);
		getContentPane().add(button_5);
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_6.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_6.setBackground(Color.PINK);
			}
		});
		button_6.addActionListener(e -> CalcModel.updateCalcArea(button_6.getText()));
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_6.setBackground(Color.PINK);
		button_6.setBounds(209, 138, 75, 40);
		getContentPane().add(button_6);
		
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_7.setBackground(Color.PINK);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_7.setBackground(Color.PINK);
			}
		});
		button_7.addActionListener(e -> CalcModel.updateCalcArea(button_7.getText()));
		button_7.setOpaque(true);
		button_7.setForeground(Color.WHITE);
		button_7.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_7.setBackground(Color.PINK);
		button_7.setBounds(35, 190, 75, 40);
		getContentPane().add(button_7);
		
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_8.setBackground(Color.PINK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_8.setBackground(Color.PINK);
			}
		});
		button_8.addActionListener(e -> CalcModel.updateCalcArea(button_8.getText()));
		button_8.setOpaque(true);
		button_8.setForeground(Color.WHITE);
		button_8.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_8.setBackground(Color.PINK);
		button_8.setBounds(122, 190, 75, 40);
		getContentPane().add(button_8);
		
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_9.setBackground(Color.PINK);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_9.setBackground(Color.PINK);
			}
		});
		button_9.addActionListener(e -> CalcModel.updateCalcArea(button_9.getText()));
		button_9.setOpaque(true);
		button_9.setForeground(Color.WHITE);
		button_9.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_9.setBackground(Color.PINK);
		button_9.setBounds(209, 190, 75, 40);
		getContentPane().add(button_9);
		
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_0.setBackground(Color.PINK);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_0.setBackground(Color.PINK);
			}
		});
		button_0.addActionListener(e -> CalcModel.updateCalcArea(button_0.getText()));
		button_0.setOpaque(true);
		button_0.setForeground(Color.WHITE);
		button_0.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_0.setBackground(Color.PINK);
		button_0.setBounds(122, 242, 75, 40);
		getContentPane().add(button_0);
		
		button_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_plus.setBackground(Color.WHITE);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_plus.setBackground(Color.PINK);
			}
		});
		button_plus.addActionListener(e -> {
			CalcModel.saveValueOfArg1();
			CalcModel.saveValueOfMathOp(OPERATOR.PLUS);
		});
		button_plus.setOpaque(true);
		button_plus.setForeground(Color.WHITE);
		button_plus.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_plus.setBackground(Color.PINK);
		button_plus.setBounds(327, 138, 75, 40);
		getContentPane().add(button_plus);
		
		button_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_minus.setBackground(Color.WHITE);
			}
			public void mouseReleased(MouseEvent e) {
				button_minus.setBackground(Color.PINK);
			}
		});
		button_minus.addActionListener(e -> {
			CalcModel.saveValueOfArg1();
			CalcModel.saveValueOfMathOp(OPERATOR.MINUS);
		});
		button_minus.setOpaque(true);
		button_minus.setForeground(Color.WHITE);
		button_minus.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_minus.setBackground(Color.PINK);
		button_minus.setBounds(327, 190, 75, 40);
		getContentPane().add(button_minus);
		
		button_equals.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_equals.setBackground(Color.WHITE);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_equals.setBackground(Color.PINK);
			}
		});
		button_equals.addActionListener(e -> {
			CalcModel.saveValueOfArg2();
			CalcModel.calculateAnswer();
		});
		button_equals.setOpaque(true);
		button_equals.setForeground(Color.WHITE);
		button_equals.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_equals.setBackground(Color.PINK);
		button_equals.setBounds(327, 242, 75, 40);
		getContentPane().add(button_equals);
		
		button_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button_clear.setBackground(Color.PINK);
			}
			
			public void mouseReleased(MouseEvent e) {
				button_clear.setBackground(Color.PINK);
			}
		});
		button_clear.addActionListener(e -> CalcModel.clearCalculator());
		button_clear.setOpaque(true);
		button_clear.setForeground(Color.BLACK);
		button_clear.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
		button_clear.setBackground(new Color(221, 160, 221));
		button_clear.setBounds(327, 85, 75, 40);
		getContentPane().add(button_clear);
		
		JLabel lblElliesCalculator = new JLabel("Sample Calculator -- design by Ellie");
		lblElliesCalculator.setBounds(6, 6, 134, 16);
		getContentPane().add(lblElliesCalculator);

	}
}






	
