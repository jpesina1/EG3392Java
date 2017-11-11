import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class LoanCalculator extends JFrame {
	JPanel panel0;
	JPanel panel1;
	JPanel panel2;
	JButton compute;

	JLabel info;
	JLabel intRate;
	JLabel numYear;
	JLabel loanPay;
	JLabel monthPay;
	JLabel totPay;
	JLabel blank;

	JTextField intRateText;
	JTextField numYearText;
	JTextField loanPayText;
	JTextField monthPayText;
	JTextField totPayText;
	
	double interest;
	int numberOfYears;
	double loanAmount;
	
	TitledBorder border;
	
	public LoanCalculator() {
		Loan l = new Loan();
		setPreferredSize(new Dimension(600, 600));
		panel0 = new JPanel();
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(400, 25));

		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(200, 200));

		compute = new JButton("Compute");

		intRate = new JLabel("Annual Interest Rate");
		numYear = new JLabel("Number of Years");
		numYear.setPreferredSize(new Dimension(30,15));
		loanPay = new JLabel("Loan Amount");

		monthPay = new JLabel("Monthly Payment");

		totPay = new JLabel("Total Payment");

		intRateText = new JTextField(l.getAnnualInterestRate() + "");
		
		numYearText = new JTextField(l.getNumberOfYears() + "");
		loanPayText = new JTextField(l.getLoanAmount() + "");
		monthPayText = new JTextField(l.getMonthlyPayment() + "");
		totPayText = new JTextField(l.getTotalPayment() + "");

		blank = new JLabel();
		add(panel0);
		
		border = new TitledBorder(border, "Enter loan amount, interest rate, and years") ;
		panel0.add(panel2);

		panel2.setBorder(border);
		panel2.setLayout(new GridLayout(6, 2));
		panel2.add(intRate);
		panel2.add(intRateText);
		panel2.add(numYear);
		panel2.add(numYearText);
		panel2.add(loanPay);
		panel2.add(loanPayText);
		panel2.add(monthPay);
		panel2.add(monthPayText);
		panel2.add(totPay);
		panel2.add(totPayText);
		panel2.add(blank);
		panel2.add(compute);

		pack();
		compute.addActionListener(new Listener());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Toolkit.getDefaultToolkit().beep();
			DecimalFormat numberFormat = new DecimalFormat("#.00");													
			//numberOfYears = Double.parseDouble(numYearText.getText());
			numberOfYears = Integer.parseInt(numYearText.getText());
			interest = Double.parseDouble(intRateText.getText());
			loanAmount = Double.parseDouble(loanPayText.getText());
			
			Loan l = new Loan(interest, numberOfYears, loanAmount);
			
			
			
			l.setAnnualInterestRate(interest);
			l.setLoanAmount(loanAmount);
			l.setNumberOfYears(numberOfYears);
			
			// l.getMonthlyPayment();
			 //l.getTotalPayment();
			 
			 monthPayText.setText(numberFormat.format(l.getMonthlyPayment()) + "");
			 totPayText.setText(numberFormat.format(l.getTotalPayment()) + "");
			
		}

	}

	public static void main(String[] args) {
		new LoanCalculator();
	}

}
