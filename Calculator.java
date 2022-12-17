import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calculator extends JFrame {
	private JButton jbtNum1;
	private JButton jbtNum2;
	private JButton jbtNum3;
	private JButton jbtNum4;
	private JButton jbtNum5;
	private JButton jbtNum6;
	private JButton jbtNum7;
	private JButton jbtNum8;
	private JButton jbtNum9;
	private JButton jbtNum0;
	private JButton jbtEqual;
	private JButton jbtAdd;
	private JButton jbtSubtract;
	private JButton jbtMultiply;
	private JButton jbtDivide;
	private JButton jbtSolve;
	private JButton jbtClear;
	private double TEMP;
	private double SolveTEMP;
	String SolveOperator;
	private JTextField jtfResult;
	String display = "";

	public Calculator() {
		this.setBackground(Color.BLACK);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));
		p1.add(jbtNum1 = new JButton("1"));
		jbtNum1.setForeground(Color.BLACK);
		jbtNum1.setBackground(Color.GRAY);
		p1.add(jbtNum2 = new JButton("2"));
		jbtNum2.setBackground(Color.GRAY);
		p1.add(jbtNum3 = new JButton("3"));
		jbtNum3.setBackground(Color.GRAY);
		p1.add(jbtNum4 = new JButton("4"));
		jbtNum4.setBackground(Color.GRAY);
		p1.add(jbtNum5 = new JButton("5"));
		jbtNum5.setBackground(Color.GRAY);
		p1.add(jbtNum6 = new JButton("6"));
		jbtNum6.setBackground(Color.GRAY);
		p1.add(jbtNum7 = new JButton("7"));
		jbtNum7.setBackground(Color.GRAY);
		p1.add(jbtNum8 = new JButton("8"));
		jbtNum8.setBackground(Color.GRAY);
		p1.add(jbtNum9 = new JButton("9"));
		jbtNum9.setBackground(Color.GRAY);
		p1.add(jbtNum0 = new JButton("0"));
		jbtNum0.setBackground(Color.GRAY);
		p1.add(jbtClear = new JButton("C"));
		jbtClear.setBackground(Color.LIGHT_GRAY);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(jtfResult = new JTextField(20));
		jtfResult.setHorizontalAlignment(JTextField.RIGHT);
		jtfResult.setEditable(false);

		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(5, 1));
		p3.add(jbtAdd = new JButton("+"));
		jbtAdd.setBackground(Color.ORANGE);
		p3.add(jbtSubtract = new JButton("-"));
		jbtSubtract.setBackground(Color.ORANGE);
		p3.add(jbtMultiply = new JButton("*"));
		jbtMultiply.setBackground(Color.ORANGE);
		p3.add(jbtDivide = new JButton("/"));
		jbtDivide.setBackground(Color.ORANGE);
		p3.add(jbtSolve = new JButton("="));
		jbtSolve.setBackground(Color.ORANGE);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.add(p2, BorderLayout.NORTH);
		p.add(p1, BorderLayout.SOUTH);
		p.add(p3, BorderLayout.EAST);

		getContentPane().add(p);

		jbtNum1.addActionListener(new ListenToOne());
		jbtNum2.addActionListener(new ListenToTwo());
		jbtNum3.addActionListener(new ListenToThree());
		jbtNum4.addActionListener(new ListenToFour());
		jbtNum5.addActionListener(new ListenToFive());
		jbtNum6.addActionListener(new ListenToSix());
		jbtNum7.addActionListener(new ListenToSeven());
		jbtNum8.addActionListener(new ListenToEight());
		jbtNum9.addActionListener(new ListenToNine());
		jbtNum0.addActionListener(new ListenToZero());

		jbtAdd.addActionListener(new ListenToAdd());
		jbtSubtract.addActionListener(new ListenToSubtract());
		jbtMultiply.addActionListener(new ListenToMultiply());
		jbtDivide.addActionListener(new ListenToDivide());
		jbtSolve.addActionListener(new ListenToSolve());
		jbtClear.addActionListener(new ListenToClear());

	} // JavaCaluclator()

	class ListenToOne implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "1");
		}
	}

	class ListenToTwo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "2");
		}
	}

	class ListenToThree implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "3");
			jtfResult.setText("");
		}
	}

	class ListenToFour implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "4");
		}
	}

	class ListenToFive implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "5");
		}
	}

	class ListenToSix implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "6");
		}
	}

	class ListenToSeven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "7");
		}
	}

	class ListenToEight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "8");
		}
	}

	class ListenToNine implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "9");
		}
	}

	class ListenToZero implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText(display + "0");
		}
	}

	class ListenToClear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = jtfResult.getText();
			jtfResult.setText("");
		}
	}

	class ListenToAdd implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SolveOperator = "+";

			TEMP = Double.parseDouble(jtfResult.getText());
			jtfResult.setText(display + "");

		}
	}

	class ListenToSubtract implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SolveOperator = "-";
			TEMP = Double.parseDouble(jtfResult.getText());
			jtfResult.setText(display + "");
		}
	}

	class ListenToMultiply implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SolveOperator = "*";
			TEMP = Double.parseDouble(jtfResult.getText());
			jtfResult.setText(display + "");
		}
	}

	class ListenToDivide implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SolveOperator = "/";
			TEMP = Double.parseDouble(jtfResult.getText());
			jtfResult.setText(display + "");
		}
	}

	class ListenToSolve implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SolveTEMP = Double.parseDouble(jtfResult.getText());
			double myText = 0;

			try {
				switch (SolveOperator) {
				case "+":
					myText = TEMP + SolveTEMP;
					jtfResult.setText(Double.toString(TEMP + SolveTEMP));
					break;

				case "-":
					myText = TEMP - SolveTEMP;
					jtfResult.setText(Double.toString(TEMP - SolveTEMP));
					break;

				case "*":
					myText = TEMP * SolveTEMP;
					jtfResult.setText(Double.toString(TEMP * SolveTEMP));
					break;

				case "/":

					myText = TEMP / SolveTEMP;
					jtfResult.setText(Double.toString(TEMP / SolveTEMP));
					break;
				}
			} catch (ArithmeticException ex) {
				System.out.println("Error, cannot divide by 0!!");
			}
			;
			jtfResult.setText(String.format("The answer is %s", Double.toString(myText)));

			if (myText < 0) {
				jtfResult.setText("See console");
				System.out.printf("Error : %f", myText);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.pack();
		calc.setLocationRelativeTo(null);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
	}

	public String printf(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
// add if statement, error handling and string formating