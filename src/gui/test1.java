package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class test1 {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel panel_1;
	private JButton btnLogIn;
	private JButton btnSignUp_1;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDearFriend = new JLabel("Dear Friend");
		lblDearFriend.setFont(new Font("Purisa", Font.BOLD, 12));
		lblDearFriend.setBounds(175, 10, 113, 15);
		frame.getContentPane().add(lblDearFriend);
		panel.setBackground(Color.RED);
		panel.setBounds(346, 0, 104, 25);
		
		frame.getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 450, 244);
		viewsignup(panel_1);

		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		/*
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBounds(0, 0, 103, 244);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(104, 0, 346, 244);
		panel_1.add(panel_3);
		*/
		
		

		
	}
	
	
	
	public void entrypointview(JPanel panel)
	
	{
		panel.setLayout(null);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(177, 80, 77, 25);
		panel.add(btnLogIn);
		
		btnSignUp_1 = new JButton("Sign Up");
		btnSignUp_1.setBounds(163, 117, 117, 25);
		panel.add(btnSignUp_1);
	}
	public void viewsignup(JPanel panel)
	{	
		
		JTextField username;
		JPasswordField passwordField;
		panel.setLayout(null);
		username = new JTextField();
		username.setBounds(158, 48, 114, 19);
		panel.add(username);
		username.setColumns(10);
		
		
		JTextField pseudo;

		pseudo = new JTextField();
		pseudo.setBounds(158, 110, 139, 19);
		panel.add(pseudo);
		pseudo.setColumns(10);
		
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(55, 50, 72, 15);
		panel.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 79, 127, 19);
		panel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(65, 77, 70, 15);
		panel.add(lblPassword);
		
		JLabel lblSessionPseudo = new JLabel("Session Pseudo");
		lblSessionPseudo.setBounds(34, 104, 113, 15);
		panel.add(lblSessionPseudo);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(158, 160, 117, 25);
		panel.add(btnSignUp);
		
	}
	public void viewlogin(JPanel panel)
	{	
		
		JTextField username;
		JPasswordField passwordField;
		panel.setLayout(null);
		username = new JTextField();
		username.setBounds(158, 48, 114, 19);
		panel.add(username);
		username.setColumns(10);
		
		
		JTextField pseudo;

		pseudo = new JTextField();
		pseudo.setBounds(158, 110, 139, 19);
		panel.add(pseudo);
		pseudo.setColumns(10);
		
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(55, 50, 72, 15);
		panel.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 79, 127, 19);
		panel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(65, 77, 70, 15);
		panel.add(lblPassword);
		
		JLabel lblSessionPseudo = new JLabel("Session Pseudo");
		lblSessionPseudo.setBounds(34, 104, 113, 15);
		panel.add(lblSessionPseudo);
		
		JButton btnSignUp = new JButton("Log In");
		btnSignUp.setBounds(158, 160, 117, 25);
		panel.add(btnSignUp);
		
	}
}
