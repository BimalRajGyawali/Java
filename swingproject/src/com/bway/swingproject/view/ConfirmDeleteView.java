package com.bway.swingproject.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.bway.swingproject.model.Employee;
import com.bway.swingproject.service.EmployeeService;
import com.bway.swingproject.service.EmployeeServiceImpl;

public class ConfirmDeleteView extends JFrame {

	private JPanel contentPane;
	private JLabel lblId;
	private JLabel lblIdValue;
	private JLabel lblFirstName;
	private JLabel lblFirstNameValue;
	private JLabel lblLastName;
	private JLabel lblLastNameValue;
	private JLabel lblGender;
	private JLabel lblGenderValue;
	private JLabel lblPhone;
	private JLabel lblPhoneValue;
	private JLabel lblPost;
	private JLabel lblPostValue;
	private JLabel lblSalary;
	private JLabel lblSalaryValue;
	private JButton btnConfirm;
	private JLabel lblConfirmDeletion;
	private Employee employee;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ConfirmDeleteView(Employee employee,JTable table) {
		
		this.employee = employee;
		this.table = table;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getLblIdValue());
		contentPane.add(getLblFirstName());
		contentPane.add(getLblFirstNameValue());
		contentPane.add(getLblLastName());
		contentPane.add(getLblLastNameValue());
		contentPane.add(getLblGender());
		contentPane.add(getLblGenderValue());
		contentPane.add(getLblPhone());
		contentPane.add(getLblPhoneValue());
		contentPane.add(getLblPost());
		contentPane.add(getLblPostValue());
		contentPane.add(getLblSalary());
		contentPane.add(getLblSalaryValue());
		contentPane.add(getBtnConfirm());
		contentPane.add(getLblConfirmDeletion());
	}
	public JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("Id");
			lblId.setBounds(104, 108, 81, 15);
		}
		return lblId;
	}
	public JLabel getLblIdValue() {
		if (lblIdValue == null) {
			lblIdValue = new JLabel("");
			lblIdValue.setBounds(245, 108, 193, 15);
			
			lblIdValue.setText(String.valueOf(employee.getId()));
			
		
		}
		return lblIdValue;
	}
	public JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(104, 135, 81, 15);
		}
		return lblFirstName;
	}
	public JLabel getLblFirstNameValue() {
		if (lblFirstNameValue == null) {
			lblFirstNameValue = new JLabel("");
			lblFirstNameValue.setBounds(245, 135, 193, 15);
			
			lblFirstNameValue.setText(employee.getFname());
		}
		return lblFirstNameValue;
	}
	public JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(104, 162, 81, 15);
		}
		return lblLastName;
	}
	public JLabel getLblLastNameValue() {
		if (lblLastNameValue == null) {
			lblLastNameValue = new JLabel("");
			lblLastNameValue.setBounds(245, 162, 193, 15);
			
			lblLastNameValue.setText(employee.getLname());
		}
		return lblLastNameValue;
	}
	public JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(104, 189, 81, 15);
		}
		return lblGender;
	}
	public JLabel getLblGenderValue() {
		if (lblGenderValue == null) {
			lblGenderValue = new JLabel("");
			lblGenderValue.setBounds(245, 189, 193, 15);
			
			lblGenderValue.setText(employee.getGender());
		}
		return lblGenderValue;
	}
	public JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(104, 212, 81, 15);
			
			
		}
		return lblPhone;
	}
	public JLabel getLblPhoneValue() {
		if (lblPhoneValue == null) {
			lblPhoneValue = new JLabel("");
			lblPhoneValue.setBounds(245, 212, 193, 15);
			
			lblPhoneValue.setText(employee.getPhone());
		
		}
		return lblPhoneValue;
	}
	public JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setBounds(104, 234, 81, 15);
		}
		return lblPost;
	}
	public JLabel getLblPostValue() {
		if (lblPostValue == null) {
			lblPostValue = new JLabel("");
			lblPostValue.setBounds(245, 234, 193, 15);
			
			lblPostValue.setText(employee.getPost());
		}
		return lblPostValue;
	}
	public JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(104, 261, 81, 15);
		}
		return lblSalary;
	}
	public JLabel getLblSalaryValue() {
		if (lblSalaryValue == null) {
			lblSalaryValue = new JLabel("");
			lblSalaryValue.setBounds(245, 261, 193, 15);
			
			lblSalaryValue.setText(String.valueOf(employee.getSalary()));
		}
		return lblSalaryValue;
	}
	public JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					EmployeeService employeeService = new EmployeeServiceImpl();
					
					
					if(employeeService.deleteEmployee(employee.getId()))
					{
						JOptionPane.showMessageDialog(null, "Deleted Successfully");
						new EmployeeForm().displayTable(table);
						dispose();
					}
					
					
					
					
					
				}
			});
			btnConfirm.setBounds(241, 335, 105, 25);
		}
		return btnConfirm;
	}
	public JLabel getLblConfirmDeletion() {
		if (lblConfirmDeletion == null) {
			lblConfirmDeletion = new JLabel("Confirm Deletion");
			lblConfirmDeletion.setFont(new Font("Dialog", Font.BOLD, 18));
			lblConfirmDeletion.setBounds(139, 38, 183, 25);
		}
		return lblConfirmDeletion;
	}
}
