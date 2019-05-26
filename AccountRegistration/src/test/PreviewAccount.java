package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PreviewAccount extends JFrame {

	private JPanel contentPane;
	private JLabel lblPhoto;
	private JLabel lblName;
	private JLabel lblNameValue;
	private JLabel lblLevel;
	private JLabel lblFaculty;
	private JLabel lblProgram;
	private JButton btnConfirm;
	private JLabel lblLevelValue;
	private JLabel lblFacultyValue;
	private JLabel lblProgramValue;
	
	private String nameString;
	private String levelString;
	private String facultyString;
	private String programString;
	private Image image;
	

	

	/**
	 * Create the frame.
	 */
	public PreviewAccount(String nameString,String leveString,String facultyString,String programString,Image image) {
		
		
		this.nameString = nameString;
		this.levelString = leveString;
		this.facultyString = facultyString;
		this.programString = programString;
		this.image = image;
		
		
		
		setTitle("Preview Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblPhoto());
		contentPane.add(getLblName());
		contentPane.add(getLblNameValue());
		contentPane.add(getLblLevel());
		contentPane.add(getLblFaculty());
		contentPane.add(getLblProgram());
		contentPane.add(getBtnConfirm());
		contentPane.add(getLblLevelValue());
		contentPane.add(getLblFacultyValue());
		contentPane.add(getLblProgramValue());
	}
	private JLabel getLblPhoto() {
		if (lblPhoto == null) {
			lblPhoto = new JLabel("");
			lblPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblPhoto.setBounds(27, 22, 118, 118);
			image = image.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_DEFAULT);
			lblPhoto.setIcon(new ImageIcon(image));
			
		}
		return lblPhoto;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(41, 173, 58, 15);
		
		}
		return lblName;
	}
	private JLabel getLblNameValue() {
		if (lblNameValue == null) {
			lblNameValue = new JLabel("");
			lblNameValue.setText(nameString);
			lblNameValue.setBounds(203, 173, 137, 15);
		}
		return lblNameValue;
	}
	private JLabel getLblLevel() {
		if (lblLevel == null) {
			lblLevel = new JLabel("Level");
			lblLevel.setBounds(41, 212, 58, 23);
		}
		return lblLevel;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(41, 263, 58, 15);
		}
		return lblFaculty;
	}
	private JLabel getLblProgram() {
		if (lblProgram == null) {
			lblProgram = new JLabel("Program");
			lblProgram.setBounds(41, 305, 58, 15);
		}
		return lblProgram;
	}
	private JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JOptionPane.showMessageDialog(null, "Registration Successfull");
					dispose();
				}
			});
			btnConfirm.setBounds(133, 379, 105, 25);
		}
		return btnConfirm;
	}
	private JLabel getLblLevelValue() {
		if (lblLevelValue == null) {
			lblLevelValue = new JLabel("");
			lblLevelValue.setText(levelString);
			lblLevelValue.setBounds(203, 216, 137, 15);
		}
		return lblLevelValue;
	}
	private JLabel getLblFacultyValue() {
		if (lblFacultyValue == null) {
			lblFacultyValue = new JLabel("");
			lblFacultyValue.setText(facultyString);
			lblFacultyValue.setBounds(203, 263, 137, 15);
		}
		return lblFacultyValue;
	}
	private JLabel getLblProgramValue() {
		if (lblProgramValue == null) {
			lblProgramValue = new JLabel("");
			lblProgramValue.setText(programString);
			lblProgramValue.setBounds(203, 305, 137, 15);
		}
		return lblProgramValue;
	}
}
