package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import java.awt.ScrollPane;

public class test3 {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel panel_1;
	private JButton btnLogIn;
	private JButton btnSignUp_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_4_1;
	private ScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 window = new test3();
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
	public test3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDearFriend = new JLabel("Dear Friend");
		lblDearFriend.setFont(new Font("Purisa", Font.BOLD, 12));
		lblDearFriend.setBounds(175, 10, 113, 15);
		frame.getContentPane().add(lblDearFriend);
		panel.setBackground(Color.GREEN);
		panel.setBounds(346, 0, 104, 25);
		frame.getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 450, 244);

		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2;
		panel_4_1 = new JPanel();
		panel_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_4_1.setBounds(0, 0, 105, 244);
		
		panel_4_1=onlineUserToLabel(panel_4_1,new CurrentUser());
		panel_1.add(panel_4_1);
		panel_4_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane = new ScrollPane();
		panel_4_1.add(scrollPane);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(153, 0, 297, 244);
		panel_1.add(panel_3);
		
	}
	public JPanel onlineUserToLabel(JPanel panel,AbstractUserInfo a)
	{	
		
	    JScrollPane scroller=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	      scroller.getVerticalScrollBar().setValue(100);
	    //panel.add(BorderLayout.CENTER, scroller);
	    
	      for (int i=0; i<60; i++) {
	      panel.add(new JLabel(a.getPseudo().concat(" (").concat(a.getUserid().concat(") "))));
	      }
		return panel;
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
