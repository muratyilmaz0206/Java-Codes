import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EmployeeGUI extends JFrame {
	
	Vector<Employee> empList = new Vector<Employee>();
	
	
	EmployeeGUI(){
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		final JTextField rfName = new JTextField(10);
		final JTextField rfSname = new JTextField(10);
		final JTextField rfSalary = new JTextField(10);
		
		
		
		add(new JLabel("name :"));
		add(rfName);
		
		add(new JLabel("surname :"));
		add(rfSname);
		
		add(new JLabel("salary :"));
		add(rfSalary);
		
		JButton btn = new JButton("add");
		btn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				Employee emp = new Employee(rfName.getText(),rfSname.getText(),Float.parseFloat(rfSalary.getText()));
				empList.add(emp);
			}
		});
		
		JButton query  = new JButton("query");
		query.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				String search_name = rfName.getText();
				String search_surname = rfSname.getText();
				float salary =0;
				for(Employee temp: empList){
					
					if(search_name.equalsIgnoreCase(temp.name) &&
							search_surname.equalsIgnoreCase(temp.surname)){
						salary=temp.salary;
					}
					
				}
				
				rfSalary.setText(salary + "");
			}
			
		});
		
		add(btn);
		add(query);
		
		pack();
	}
	
	
	public static void main(String[] args){
		new EmployeeGUI();
	}
}
