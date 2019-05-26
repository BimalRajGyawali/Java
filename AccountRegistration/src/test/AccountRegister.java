package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.io.File;



import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountRegister extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblName;
	private JLabel lblLevel;
	private JLabel lblFaculty;
	private JTextField txtLevel;
	private JTextField txtFaculty;
	private JLabel lblProgram;
	private JTextField txtProgram;
	private JButton btnRegister;
	private JLabel lblPhoto;
	private JButton btnBrowse;
	private Image image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountRegister frame = new AccountRegister();
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
	public AccountRegister() {
		setTitle("Exam Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtName());
		contentPane.add(getLblName());
		contentPane.add(getLblLevel());
		contentPane.add(getLblFaculty());
		contentPane.add(getTxtLevel());
		contentPane.add(getTxtFaculty());
		contentPane.add(getLblProgram());
		contentPane.add(getTxtProgram());
		contentPane.add(getBtnRegister());
		contentPane.add(getLblPhoto());
		contentPane.add(getBtnBrowse());
	}
	private JTextField getTxtName() {
		if (txtName == null) {
			txtName = new JTextField();
			txtName.setBounds(298, 183, 175, 19);
			txtName.setColumns(10);
		}
		return txtName;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(59, 185, 58, 15);
		}
		return lblName;
	}
	private JLabel getLblLevel() {
		if (lblLevel == null) {
			lblLevel = new JLabel("Level");
			lblLevel.setBounds(59, 221, 58, 15);
		}
		return lblLevel;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(59, 262, 58, 15);
		}
		return lblFaculty;
	}
	private JTextField getTxtLevel() {
		if (txtLevel == null) {
			txtLevel = new JTextField();
			txtLevel.setBounds(298, 219, 175, 19);
			txtLevel.setColumns(10);
		}
		return txtLevel;
	}
	private JTextField getTxtFaculty() {
		if (txtFaculty == null) {
			txtFaculty = new JTextField();
			txtFaculty.setBounds(298, 260, 175, 19);
			txtFaculty.setColumns(10);
		}
		return txtFaculty;
	}
	private JLabel getLblProgram() {
		if (lblProgram == null) {
			lblProgram = new JLabel("Program");
			lblProgram.setBounds(59, 300, 58, 15);
		}
		return lblProgram;
	}
	private JTextField getTxtProgram() {
		if (txtProgram == null) {
			txtProgram = new JTextField();
			txtProgram.setBounds(298, 298, 175, 19);
			txtProgram.setColumns(10);
		}
		return txtProgram;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String nameString = txtName.getText();
					String levelString = txtLevel.getText();
					String facultyString = txtFaculty.getText();
					String programString = txtProgram.getText();
					
					
					if(image != null) {
					     new PreviewAccount(nameString, levelString, facultyString, programString,image).setVisible(true);
					     dispose();
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Photo not set");
					}
				    
					
					
					
					
					
				}
			});
			btnRegister.setBounds(194, 386, 105, 25);
		}
		return btnRegister;
	}
	private JLabel getLblPhoto() {
		if (lblPhoto == null) {
			lblPhoto = new JLabel("Your photo here");
			lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
			lblPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblPhoto.setBounds(27, 22, 118, 118);
		}
		return lblPhoto;
	}
	private JButton getBtnBrowse() {
		if (btnBrowse == null) {
			btnBrowse = new JButton("Browse...");
			btnBrowse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.showOpenDialog(null);
					
					File imageFile = fileChooser.getSelectedFile();
				
					if(imageFile != null)
					{
						ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
						image = icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_DEFAULT);
						lblPhoto.setIcon(new ImageIcon(image));
					}	
					
				}
			});
			btnBrowse.setBounds(27, 148, 105, 25);
		}
		return btnBrowse;
	}
}
