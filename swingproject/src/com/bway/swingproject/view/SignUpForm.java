package com.bway.swingproject.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bway.swingproject.service.EmployeeService;
import com.bway.swingproject.service.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblCreateUserId;
	private JLabel lblUsername;
	private JTextField textFieldUsername;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnSubmit;


	/**
	 * Create the frame.
	 */
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 478, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCreateUserId());
		contentPane.add(getLblUsername());
		contentPane.add(getTextFieldUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnSubmit());
	}
	public JLabel getLblCreateUserId() {
		if (lblCreateUserId == null) {
			lblCreateUserId = new JLabel("Create User Id");
			lblCreateUserId.setFont(new Font("Dialog", Font.BOLD, 16));
			lblCreateUserId.setHorizontalAlignment(SwingConstants.CENTER);
			lblCreateUserId.setBounds(82, 23, 255, 22);
		}
		return lblCreateUserId;
	}
	public JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setBounds(60, 94, 104, 15);
		}
		return lblUsername;
	}
	public JTextField getTextFieldUsername() {
		if (textFieldUsername == null) {
			textFieldUsername = new JTextField();
			textFieldUsername.setBounds(197, 90, 205, 22);
			textFieldUsername.setColumns(10);
		}
		return textFieldUsername;
	}
	public JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(63, 136, 70, 15);
		}
		return lblPassword;
	}
	public JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(197, 134, 205, 22);
		}
		return passwordField;
	}
	public JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					String username = textFieldUsername.getText();
					String password = passwordField.getText();
					
					
					if(username.trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Username empty");
						return;
					}
					
					if(password.trim().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Password Empty");
						return;
					}
					
					EmployeeService employeeService = new EmployeeServiceImpl();
					
					if(employeeService.signUp(username, password))
					{
						JOptionPane.showMessageDialog(null, "User Id Created Successfully");
						dispose();
					}
  					
					
					
					
					
				}
			});
			btnSubmit.setBounds(154, 191, 105, 25);
		}
		return btnSubmit;
	}
}
