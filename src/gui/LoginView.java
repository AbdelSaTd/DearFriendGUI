package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class LoginView {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	private JTextField pseudo;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void LoginWindow (){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setBounds(194, 90, 139, 29);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(99, 97, 84, 15);
		frame.getContentPane().add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 131, 139, 29);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(99, 138, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblSessionPseudo = new JLabel("Session Pseudo");
		lblSessionPseudo.setBounds(65, 192, 139, 15);
		frame.getContentPane().add(lblSessionPseudo);
		
		pseudo = new JTextField();
		pseudo.setBounds(194, 185, 139, 29);
		frame.getContentPane().add(pseudo);
		pseudo.setColumns(10);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
