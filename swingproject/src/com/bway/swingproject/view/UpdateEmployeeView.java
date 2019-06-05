package com.bway.swingproject.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.bway.swingproject.model.Employee;
import com.bway.swingproject.service.EmployeeService;
import com.bway.swingproject.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateEmployeeView extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField textFieldFirstName;
	private JLabel lblLastName;
	private JTextField textFieldLastName;
	private JLabel lblPost;
	private JComboBox comboBoxPost;
	private JLabel lblSalary;
	private JTextField textFieldSalary;
	private JLabel lblPhone;
	private JTextField textFieldPhone;
	private JLabel lblGender;
	private JLabel lblDateOfBirth;
	private JDateChooser dateChooser;
	private JLabel lblDateOfJoining;
	private JDateChooser dateChooserDateOfJoining;
	private JButton btnConfirm;
	private JLabel lblUpdateEmployeeInformation;
	private JTextField textFieldGender;
	
	private JTable table;
	
	
	int userId = 0;


	/**
	 * Create the frame.
	 */
	public UpdateEmployeeView(JTable table) {
		
		this.table  = table;
		
		setTitle("Update Employee");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getTextFieldFirstName());
		contentPane.add(getLblLastName());
		contentPane.add(getTextFieldLastName());
		contentPane.add(getLblPost());
		contentPane.add(getComboBoxPost());
		contentPane.add(getLblSalary());
		contentPane.add(getTextFieldSalary());
		contentPane.add(getLblPhone());
		contentPane.add(getTextFieldPhone());
		contentPane.add(getLblGender());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getDateChooser());
		contentPane.add(getLblDateOfJoining());
		contentPane.add(getDateChooserDateOfJoining());
		contentPane.add(getBtnConfirm());
		contentPane.add(getLblUpdateEmployeeInformation());
		contentPane.add(getTextFieldGender());
	}
	
	
	
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(78, 85, 83, 15);
		}
		return lblFirstName;
	}
	private JTextField getTextFieldFirstName() {
		if (textFieldFirstName == null) {
			textFieldFirstName = new JTextField();
			textFieldFirstName.setBounds(202, 83, 171, 19);
			textFieldFirstName.setColumns(10);
		}
		return textFieldFirstName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(75, 125, 86, 15);
		}
		return lblLastName;
	}
	private JTextField getTextFieldLastName() {
		if (textFieldLastName == null) {
			textFieldLastName = new JTextField();
			textFieldLastName.setBounds(202, 123, 171, 19);
			textFieldLastName.setColumns(10);
		}
		return textFieldLastName;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setBounds(85, 163, 58, 15);
		}
		return lblPost;
	}
	private JComboBox getComboBoxPost() {
		if (comboBoxPost == null) {
			comboBoxPost = new JComboBox();
			comboBoxPost.setModel(new DefaultComboBoxModel(new String[] {"select", "Engineer", "Manager", "Accountant"}));
			comboBoxPost.setBounds(202, 158, 171, 24);
		}
		return comboBoxPost;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(85, 207, 58, 15);
		}
		return lblSalary;
	}
	private JTextField getTextFieldSalary() {
		if (textFieldSalary == null) {
			textFieldSalary = new JTextField();
			textFieldSalary.setBounds(202, 205, 171, 19);
			textFieldSalary.setColumns(10);
		}
		return textFieldSalary;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(85, 242, 58, 15);
		}
		return lblPhone;
	}
	private JTextField getTextFieldPhone() {
		if (textFieldPhone == null) {
			textFieldPhone = new JTextField();
			textFieldPhone.setBounds(202, 240, 171, 19);
			textFieldPhone.setColumns(10);
		}
		return textFieldPhone;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(85, 277, 58, 15);
		}
		return lblGender;
	}
	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date of Birth");
			lblDateOfBirth.setBounds(85, 312, 76, 15);
		}
		return lblDateOfBirth;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(202, 308, 171, 19);
		}
		return dateChooser;
	}
	private JLabel getLblDateOfJoining() {
		if (lblDateOfJoining == null) {
			lblDateOfJoining = new JLabel("Date Of Joining");
			lblDateOfJoining.setBounds(85, 348, 90, 15);
		}
		return lblDateOfJoining;
	}
	private JDateChooser getDateChooserDateOfJoining() {
		if (dateChooserDateOfJoining == null) {
			dateChooserDateOfJoining = new JDateChooser();
			dateChooserDateOfJoining.setBounds(202, 348, 171, 19);
		}
		return dateChooserDateOfJoining;
	}
	private JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					Employee employee = new Employee();
					
					employee.setId(userId);
					employee.setFname(textFieldFirstName.getText());
					employee.setLname(textFieldLastName.getText());
					employee.setGender(textFieldGender.getText());
					employee.setSalary(Double.parseDouble(textFieldSalary.getText()));
					employee.setDateOfBirth(new Date(dateChooser.getDate().getTime()));
					employee.setDateOfJoining(new Date(dateChooserDateOfJoining.getDate().getTime()));
					employee.setPost(comboBoxPost.getSelectedItem().toString());
					
					EmployeeService employeeService = new EmployeeServiceImpl();
					
					if(employeeService.updateEmployee(employee))
					{
						JOptionPane.showMessageDialog(null, "Updated Successfully");
						
						new EmployeeForm().displayTable(table);
                        
				        dispose();
				        
				        
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnConfirm.setBounds(176, 400, 105, 25);
		}
		return btnConfirm;
	}
	private JLabel getLblUpdateEmployeeInformation() {
		if (lblUpdateEmployeeInformation == null) {
			lblUpdateEmployeeInformation = new JLabel("Update Employee Information");
			lblUpdateEmployeeInformation.setFont(new Font("Dialog", Font.BOLD, 18));
			lblUpdateEmployeeInformation.setBounds(116, 12, 276, 31);
		}
		return lblUpdateEmployeeInformation;
	}
	private JTextField getTextFieldGender() {
		if (textFieldGender == null) {
			textFieldGender = new JTextField();
			textFieldGender.setBounds(202, 271, 171, 19);
			textFieldGender.setColumns(10);
		}
		return textFieldGender;
	}
	
	
	// set all data of employee in edit form
	
	public void setData(int id)
	{
		userId = id;
		
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		Employee employee = employeeService.getByID(id);
		
		textFieldFirstName.setText(employee.getFname());
		textFieldLastName.setText(employee.getLname());
		textFieldPhone.setText(employee.getPhone());
		textFieldGender.setText(employee.getGender());
		textFieldSalary.setText(String.valueOf(employee.getSalary()));
		
		comboBoxPost.setSelectedItem(employee.getPost());
		
		dateChooser.setDate(employee.getDateOfBirth());
		dateChooserDateOfJoining.setDate(employee.getDateOfJoining());
		
		
		/*  In case of gender 
		 * 
		 *   if(employee.getGender().equalsIgnoreCase("male")
		 *   {
		 *     rdbtnMale.setSelected("true");
		 *     
		 *   }
		 *   
		 *   else if(female)
		 *   
		 *   else if(other)
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
