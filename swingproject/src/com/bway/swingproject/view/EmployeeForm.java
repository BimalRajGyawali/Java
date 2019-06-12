package com.bway.swingproject.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.bway.swingproject.model.Employee;
import com.bway.swingproject.service.EmployeeService;
import com.bway.swingproject.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;

import sun.tools.tree.FinallyStatement;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField txtFirstName;
	private JLabel lblLastName;
	private JTextField txtLastName;
	private JLabel lblPhone;
	private JTextField txtPhone;
	private JLabel lblSalary;
	private JTextField txtSalary;
	private JLabel lblPost;
	private JLabel lblDateOfBirth;
	private JLabel lblDateOfJoining;
	private JLabel lblGender;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JButton btnSubmit;
	private JLabel lblPhoto;
	private JButton btnBrowse;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private JComboBox comboBoxPost;
	private JButton btnLoad;
	private JButton btnDelete;
	private JDateChooser dateChooser;
	private JDateChooser dateChooserJoiningDate;
	private JButton btnUpdate;
	private JTextField textFieldSearch;
	private JButton btnSearch;
	private JLabel lblIcon;
	private JButton btnReadFile;
	private JButton btnHide;



	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setResizable(false);
		setTitle("Employee Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getLblLastName());
		contentPane.add(getTxtFirstName());
		contentPane.add(getTxtLastName());
		contentPane.add(getLblPhone());
		contentPane.add(getTxtPhone());
		contentPane.add(getLblSalary());
		contentPane.add(getTxtSalary());
		contentPane.add(getLblPost());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getLblDateOfJoining());
		contentPane.add(getLblGender());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getRdbtnOther());
		contentPane.add(getBtnSubmit());
		contentPane.add(getLblPhoto());
		contentPane.add(getBtnBrowse());
		contentPane.add(getScrollPane());
		contentPane.add(getComboBoxPost());
		contentPane.add(getBtnLoad());
		contentPane.add(getBtnDelete());
		contentPane.add(getDateChooser());
		contentPane.add(getDateChooserJoiningDate());
		contentPane.add(getBtnUpdate());
		
		displayTable(table);
		contentPane.add(getTextFieldSearch());
		contentPane.add(getBtnSearch());
		contentPane.add(getLblIcon());
		contentPane.add(getBtnReadFile());
		contentPane.add(getBtnHide());
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(30, 243, 78, 15);
		}
		return lblFirstName;
	}
	private JTextField getTxtFirstName() {
		if (txtFirstName == null) {
			txtFirstName = new JTextField();
			txtFirstName.setBounds(141, 241, 161, 19);
			txtFirstName.setColumns(10);
		}
		return txtFirstName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(30, 270, 68, 15);
		}
		return lblLastName;
	}
	private JTextField getTxtLastName() {
		if (txtLastName == null) {
			txtLastName = new JTextField();
			txtLastName.setBounds(141, 272, 161, 19);
			txtLastName.setColumns(10);
		}
		return txtLastName;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(30, 303, 58, 15);
		}
		return lblPhone;
	}
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setBounds(141, 303, 161, 19);
			txtPhone.setColumns(10);
		}
		return txtPhone;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(30, 336, 58, 15);
		}
		return lblSalary;
	}
	private JTextField getTxtSalary() {
		if (txtSalary == null) {
			txtSalary = new JTextField();
			txtSalary.setBounds(141, 334, 161, 19);
			txtSalary.setColumns(10);
		}
		return txtSalary;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setBounds(30, 368, 78, 15);
		}
		return lblPost;
	}
	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date of Birth");
			lblDateOfBirth.setBounds(30, 397, 93, 15);
		}
		return lblDateOfBirth;
	}
	private JLabel getLblDateOfJoining() {
		if (lblDateOfJoining == null) {
			lblDateOfJoining = new JLabel("Joining Date");
			lblDateOfJoining.setBounds(30, 426, 83, 23);
		}
		return lblDateOfJoining;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(30, 463, 58, 15);
		}
		return lblGender;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			buttonGroup.add(rdbtnMale);
			rdbtnMale.setBounds(102, 459, 58, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBounds(165, 459, 83, 23);
		}
		return rdbtnFemale;
	}
	private JRadioButton getRdbtnOther() {
		if (rdbtnOther == null) {
			rdbtnOther = new JRadioButton("Other");
			buttonGroup.add(rdbtnOther);
			rdbtnOther.setBounds(252, 459, 93, 23);
		}
		return rdbtnOther;
	}
	private JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					Employee employee = new Employee();
					
					employee.setFname(txtFirstName.getText());
					employee.setLname(txtLastName.getText());
					employee.setSalary(Double.parseDouble(txtSalary.getText()));
					employee.setPhone(txtPhone.getText());
					
					
					employee.setDateOfBirth(new Date(dateChooser.getDate().getTime()));
					employee.setDateOfJoining(new Date(dateChooserJoiningDate.getDate().getTime()));
					
					if(rdbtnMale.isSelected())
					{
						employee.setGender("male");
					}
					
					else if(rdbtnFemale.isSelected()){
						
						employee.setGender("female");
					}
					
					else if(rdbtnOther.isSelected())
					{
						employee.setGender("other");
					}
					
					
					employee.setPost(comboBoxPost.getSelectedItem().toString());
					
					
					EmployeeService employeeService = new EmployeeServiceImpl();
					
					if(employeeService.addEmployee(employee))
					{
						JOptionPane.showMessageDialog(null, "Added Success");
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Added Failed");
					}
					
					
					
					
					// empty the input fields
					
					txtFirstName.setText("");
					txtLastName.setText("");
					txtPhone.setText("");
					txtSalary.setText("");
					
					buttonGroup.clearSelection();
					comboBoxPost.setSelectedIndex(0);
					
					
					dateChooser.setCalendar(null);
					dateChooserJoiningDate.setCalendar(null);
					
					
					displayTable(table);
					
					
					
					
					
					
					
				}
			});
			btnSubmit.setBounds(102, 536, 105, 25);
		}
		return btnSubmit;
	}
	private JLabel getLblPhoto() {
		if (lblPhoto == null) {
			lblPhoto = new JLabel("Photo");
			lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
			lblPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblPhoto.setBounds(30, 12, 120, 133);
		}
		return lblPhoto;
	}
	private JButton getBtnBrowse() {
		if (btnBrowse == null) {
			btnBrowse = new JButton("Browse...");
			btnBrowse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnBrowse.setBounds(40, 156, 105, 25);
		}
		return btnBrowse;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(387, 116, 476, 343);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "First Name", "Last Name","Gender"
				}
			));
		}
		
		
		
		return table;
	}
	private JComboBox getComboBoxPost() {
		if (comboBoxPost == null) {
			comboBoxPost = new JComboBox();
			comboBoxPost.setModel(new DefaultComboBoxModel(new String[] {"select", "Engineer", "Accountant", "Manager", ""}));
			comboBoxPost.setBounds(141, 365, 151, 24);
		}
		return comboBoxPost;
	}
	private JButton getBtnLoad() {
		if (btnLoad == null) {
			btnLoad = new JButton("Load");
			btnLoad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					
					
					
				   displayTable(table);
					
					
					
					
					
					
					
					
					
				}
			});
			btnLoad.setBounds(475, 495, 105, 25);
		}
		return btnLoad;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					
					// deleting by selecting the row
					if(table.getSelectedRow() < 0)
					{
						JOptionPane.showMessageDialog(null, "Select any row");
						return ;
					}
					
					
				 int row = table.getSelectedRow();
				 
				 DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				 
				 int id = (int) tableModel.getValueAt(row, 0);
				 
				 EmployeeService employeeService = new EmployeeServiceImpl();
				 
				 Employee employee = employeeService.getByID(id);
				 
				 new ConfirmDeleteView(employee,table).setVisible(true);
				 
				 
					
					
					
					
					
					
				}
			});
			btnDelete.setBounds(758, 495, 105, 25);
		}
		return btnDelete;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(141, 397, 151, 19);
		}
		return dateChooser;
	}
	private JDateChooser getDateChooserJoiningDate() {
		if (dateChooserJoiningDate == null) {
			dateChooserJoiningDate = new JDateChooser();
			dateChooserJoiningDate.setBounds(141, 426, 151, 19);
		}
		return dateChooserJoiningDate;
	}
	
	
	public void displayTable(JTable table)
	{
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees =  employeeService.getAllEmployees();
		
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		
		// empty the table first otherwise on every button click same data will repeatedly displayed
		
		tableModel.setRowCount(0);
		
		for(Employee employee : employees)
		{
			tableModel.addRow(new Object[] {employee.getId(),employee.getFname(),employee.getLname(),employee.getGender()});
		}
		
		
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (table.getSelectedRow()<0) {
						
						JOptionPane.showMessageDialog(null, "Select any row");
						return;
					}
					
					int row = table.getSelectedRow();
					
					
					DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
					
					int id = (int) tableModel.getValueAt(row, 0);
					
					
					
					UpdateEmployeeView updateEmployeeView = new UpdateEmployeeView(table);
					updateEmployeeView.setData(id);
					updateEmployeeView.setVisible(true);
					
					
					
					
					
					
					
					
				}
			});
			btnUpdate.setBounds(606, 495, 105, 25);
		}
		return btnUpdate;
	}
	public JTextField getTextFieldSearch() {
		if (textFieldSearch == null) {
			textFieldSearch = new JTextField();
			textFieldSearch.setBounds(387, 67, 273, 23);
			textFieldSearch.setColumns(10);
			
			
			textFieldSearch.addKeyListener(new KeyAdapter() {
				
				public void keyPressed(KeyEvent e)
				{
					String input = textFieldSearch.getText();
					
					EmployeeService employeeService = new EmployeeServiceImpl();
					
					List<Employee> employees =  employeeService.searchEmployees(input);
					
					DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
					
					tableModel.setRowCount(0);
					
					for(Employee employee : employees)
					{
						tableModel.addRow(new Object[] {
								
								employee.getId(),employee.getFname(),employee.getLname(),employee.getGender()
								
						});
					}
					
					
					
					
					
					
					
					
					
				}
 				
			});
			
		}
	
		return textFieldSearch;
	}
	public JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					if(textFieldSearch.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter id");
						return;
					}
					
					try {
						
						int id = Integer.parseInt(textFieldSearch.getText());
						
			            EmployeeService employeeService = new EmployeeServiceImpl();
			            
			            if(employeeService.doesExist(id) == false)
			            {
			            	JOptionPane.showMessageDialog(null, "id "+id+" does not exist");
			            	return;
			            }
			            
						Employee employee = employeeService.getByID(id);
						
						DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
						
						tableModel.setRowCount(0);
						
						tableModel.addRow(new Object[] {
								
								employee.getId() , employee.getFname(), employee.getLname(),employee.getGender()
								
						});
						
						
						
						
						
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Id should be in number");
					
					}
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnSearch.setBounds(713, 66, 105, 25);
		}
		return btnSearch;
	}
	public JLabel getLblIcon() {
		if (lblIcon == null) {
			lblIcon = new JLabel("New label");
			lblIcon.setBounds(387, 67, 58, 19);
		}
		
		
		return lblIcon;
	}
	public JButton getBtnReadFile() {
		if (btnReadFile == null) {
			btnReadFile = new JButton("Read File");
			btnReadFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					JFileChooser fileChooser = new JFileChooser();
				    fileChooser.showOpenDialog(null); // show() is depreciated
				    
				    BufferedReader bufferedReader = null;
				    
				    try {
				    	    bufferedReader = new BufferedReader(
								new FileReader(fileChooser.getSelectedFile()));
						
						
				    	    bufferedReader.readLine();
				    	    String row;
				    	    
				    	    while((row = bufferedReader.readLine()) != null)
				    	    {
				    	    
				    	              String[] rowValues = row.split(",");
				    	              
				    	              Employee  employee = new Employee();
				    	              
				    	              employee.setFname(rowValues[0]);
				    	              employee.setLname(rowValues[1]);
				    	              employee.setPhone(rowValues[2]);
				    	              employee.setGender(rowValues[3]);
				    	              employee.setPost(rowValues[4]);
				    	              
				    	              EmployeeService employeeService = new EmployeeServiceImpl();
				    	              
				    	              employeeService.addEmployee(employee);
				    	              
				    	    
				    	    }
						
						
						
						
						
						
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					}
				    
				    catch (Exception e) {
					 
				    	e.printStackTrace();
					}
				    
				    finally
				    {
				    	try {
							bufferedReader.close();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
				    }
				    
				    
					
				    
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnReadFile.setBounds(241, 536, 105, 25);
		}
		return btnReadFile;
	}
	public JButton getBtnHide() {
		if (btnHide == null) {
			btnHide = new JButton("Hide");
			btnHide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
		           DefaultTableModel tableModel =   (DefaultTableModel) table.getModel();
		           
		           tableModel.setRowCount(0);
				}
			});
			btnHide.setBounds(358, 495, 105, 25);
		}
		return btnHide;
	}
}
