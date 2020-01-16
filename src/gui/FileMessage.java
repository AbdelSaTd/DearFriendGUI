package gui;
import java.util.Date;


@SuppressWarnings("serial")
public class FileMessage extends AbstractMessage{

String filename; // Represent the location+filename in the file system of an image
byte[] data;

public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}
public byte[] getData() {
	return data;
}
public void setData(byte[] data) {
	this.data = data;
}
public FileMessage(String userid, String receiverid, Date date,String fileName,byte []data)
{
	super(userid, receiverid, date, MessageType.File);
	filename=fileName;
}
	public String toString()
	{
		return "Filename : "+ this.filename ;
	}
}
