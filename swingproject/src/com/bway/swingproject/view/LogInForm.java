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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField textFieldUsername;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnSignup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInForm frame = new LogInForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getTextFieldUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnLogin());
		contentPane.add(getBtnSignup());
	}
	public JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setBounds(87, 103, 94, 15);
		}
		return lblUsername;
	}
	public JTextField getTextFieldUsername() {
		if (textFieldUsername == null) {
			textFieldUsername = new JTextField();
			textFieldUsername.setBounds(237, 96, 241, 30);
			textFieldUsername.setColumns(10);
		}
		return textFieldUsername;
	}
	public JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(87, 167, 81, 15);
		}
		return lblPassword;
	}
	public JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(237, 163, 241, 30);
		}
		return passwordField;
	}
	public JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("LogIn");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					String username = getTextFieldUsername().getText();
					String password = getPasswordField().getText();
					
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
					
					
					
					if(employeeService.isUserVerified(username,password ))
					{
						
						new EmployeeForm().setVisible(true);
						dispose();
					}
					
					else 
					{
					
						
						JOptionPane.showMessageDialog(null, "Username and Password not matched");
					}
					
					
					
					
					
					
					
					
				}
			});
			btnLogin.setBounds(224, 244, 105, 25);
		}
		return btnLogin;
	}
	public JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("SignUp");
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					new SignUpForm().setVisible(true);
					
					
					
				}
			});
			btnSignup.setBounds(224, 310, 105, 25);
		}
		return btnSignup;
	}
}
