import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Employee extends JPanel {
	static JFrame j;
	ResultSet result;
	Object[][] rowData;
	String[] colNames;
	JScrollPane scrollPane;
	JTable myTable;
	JButton addPerson, removePerson;
	JTextField empIDUser, empNameUser, empPositionUser, empPayRateUser;
	JLabel empID, empName, empPosition, empPayRate;
	JPanel tableArea, buttonArea;
	String name, position;
	int id;
	Double payRate;
	 
	Employee() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/personnel", "root", "");
		Statement stmt = conn.createStatement();
		// Create a string with a SELECT statement.
		String sqlStatement = "SELECT * FROM Employee";
		// Send the statement to the DBMS.
		ResultSet result = stmt.executeQuery(sqlStatement);
		// gatherInfo();
		
		
		
		String name, position;
		int id;
		Double payRate;
		String[] colNames = { "Employee ID", "Employee Name", "Position", "Hourly Pay Rate" };
		while (result.next()) {
			id = result.getInt("Employee_ID");
			name = result.getString("Employee_Name");
			position = result.getString("Position");
			payRate = result.getDouble("Hourly_Pay_Rate");
			System.out.println(id + " " + name + " " + position + " " + payRate);
			Object[][] rowData = { { id, name, position, payRate }

			};

		}

		JTable myTable = new JTable(rowData, colNames);
		JScrollPane scrollPane = new JScrollPane(myTable);
		j.add(scrollPane, BorderLayout.CENTER);
		
		
		 
		 conn.close();
		
	}
	public static void setScreen() {
		JPanel buttonSetup = new JPanel();
		buttonSetup.setLayout(new GridLayout(1,2));
		JPanel buttonAreatop = new JPanel();
		JPanel buttonAreabot = new JPanel();
		
		JButton addPerson = new JButton("Add Person");
		//addPerson.addActionListener(new buttonListener());
		JButton removePerson = new JButton("Remove Person");
		//removePerson.addActionListener(new buttonListener());
		
		JTextField empIDUser = new JTextField();
		JLabel empID = new JLabel("Employee ID");
		
		JTextField empNameUser = new JTextField();
		JLabel empName = new JLabel("Employee Name");
		
		JTextField empPositionUser = new JTextField();
		JLabel empPosition = new JLabel("Employee Position");
		
		JTextField empPayRateUser = new JTextField();
		JLabel empPayRate = new JLabel("Employee Hourly Pay Rate");
		
		buttonAreatop.add(addPerson);
		buttonAreatop.add(removePerson);
		buttonSetup.add(buttonAreatop);
		
		buttonAreabot.add(empID);
		buttonAreabot.add(empIDUser);
		buttonAreabot.add(empName);
		buttonAreabot.add(empNameUser);
		buttonAreabot.add(empPosition);
		buttonAreabot.add(empPositionUser);
		buttonSetup.add(buttonAreabot);
		
		j.add(buttonSetup, BorderLayout.SOUTH);
		
		
		
	}
	class buttonListener implements ActionListener { // for jbuttons

		@Override
		public void actionPerformed(ActionEvent e) {

			Toolkit.getDefaultToolkit().beep();
			if(e.getSource() == addPerson){
				Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/personnel", "root", "");
					Statement stmt = conn.createStatement();
					String name = empNameUser.getText(); 
					String position = empPositionUser.getText();
					int id = Integer.parseInt(empIDUser.getText());
					Double payRate = Double.parseDouble(empPayRateUser.getText());
					String sql = "INSERT INTO Employee VALUES (" + id + ",'" + name + "','" + position + "'," + payRate;
					 ResultSet resultSet = stmt.executeQuery(sql);
					 conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(e.getSource() == removePerson){
				Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/personnel", "root", "");
					Statement stmt = conn.createStatement();
					int id = Integer.parseInt(empIDUser.getText());
					 String sql = "DELETE FROM Employee WHERE Employee_ID = " + id ;
					 ResultSet resultSet = stmt.executeQuery(sql);
					 conn.close();				
					 } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
			
			
			}
		}

	
	public static void main(String[] args) throws SQLException {
		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());
		new Employee();
		setScreen();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);

	}

	
	
	
}

