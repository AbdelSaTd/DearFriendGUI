package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JList;

public class test4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test4 window = new test4();
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
	public test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 450, 244);

		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		//panel_1.add(panel_2);
		
		JPanel panel_2 = new JPanel();
		//panel_1.add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBounds(0, 0, 100, 300);
		panel_2=onlineUserToLabel(panel_2,new CurrentUser());
		panel_2.setPreferredSize(new Dimension(100,350));
		
		JScrollPane scroller = new JScrollPane(panel_2);
		scroller.setSize(100, 300);
		//scroller.setLocation(108, 12);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


		JScrollBar vertical = scroller.getVerticalScrollBar();	
		vertical.setValue( 100);


		scroller.setBorder(null);
		//panel_1.add(panel_2);
		panel_1.add(scroller);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(92, 48, 346, 244);
		panel_3.add(messageToPanel(new TextMessage("mike", "none", new Date(), "Hello World"),new CurrentUser()));
		panel_3.add(messageToPanel(new TextMessage("none", "mike", new Date(), "Hey!"),new CurrentUser()));

		 JScrollPane scroller2 = new JScrollPane(panel_3);
		 panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		 
		 JList list = new JList();
		 list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		 panel_3.add(list);
		scroller2.setSize(350, 275);
			//scroller.setLocation(108, 12);
			scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scroller2.setLocation(100, 20);


			JScrollBar vertical2 = scroller.getVerticalScrollBar();	
			vertical2.setValue( 100);


			scroller2.setBorder(null);
			//panel_1.add(panel_2);
			panel_1.add(scroller2);
		/**JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(104, 0, 346, 244);
		panel_1.add(panel_3);
		**/
	}
	public JPanel onlineUserToLabel(JPanel panel,AbstractUserInfo a)
	{	
		
	
	    //panel.add(BorderLayout.CENTER, scroller);
	    
	      for (int i=0; i<60; i++) {
	      panel.add(new JLabel(a.getPseudo().concat(" (").concat(a.getUserid().concat(") "))));
	      }
		return panel;
		}
	public JPanel messageToPanel(AbstractMessage am,AbstractUserInfo user)
	{	
		
		 JPanel messagePanel=null;

  	  switch(am.getType()) {
  	  case Text:
  		  messagePanel= new JPanel();
  		 //messagePanel.setPreferredSize(new Dimension(290,10));
  		 if(user.getUserid().equals(am.getSenderid()))
  				{messagePanel.setBackground(Color.BLUE);}
  		 else {
  			messagePanel.setBackground(Color.RED);
  		 }
  		 messagePanel.add(new JLabel(AbstractMessage.getTextMessage(am).getText_content()));
  		 break;
  		  
  	  }	    
	      
		return messagePanel;
		}
	
	
	
	public JPanel messagesToLabel(JPanel panel,ArrayList<AbstractMessage> a)
	{	
		
	
	    //panel.add(BorderLayout.CENTER, scroller);
	    
	      for( AbstractMessage am :a)
	      {
	      }
		return panel;
		}
}
