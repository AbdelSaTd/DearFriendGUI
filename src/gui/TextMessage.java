package gui;

import java.util.Date;


@SuppressWarnings("serial")
public class TextMessage extends AbstractMessage {


	String text_content; 
	
	
	public TextMessage(String userid, String receiverid, Date date,String content) {
		super(userid, receiverid, date, MessageType.Text);
		text_content=content;
	}
	
	public String toString()
	{
		return "Message Content : "+ this.text_content;
		
	}
	public String getText_content() {
		return text_content;
	}
	public void setText_content(String text_content) {
		this.text_content = text_content;
	}

}
