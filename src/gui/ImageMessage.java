package gui;
import java.util.Date;


@SuppressWarnings("serial")
public class ImageMessage extends AbstractMessage{

String filename; 
byte[] data;
public byte[] getData() {
	return data;
}
public void setData(byte[] data) {
	this.data = data;
}
public ImageMessage(String userid, String receiverid, Date date,String fileName,byte []data)
{
	super(userid, receiverid, date, MessageType.Image);
	filename=fileName;
}
	public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}
	public String toString()
	{
		return "Image Filename : "+ this.filename ;
		
	}
}
