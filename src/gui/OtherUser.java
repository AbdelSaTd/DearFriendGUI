package gui;


import java.io.IOException;
import java.net.InetAddress;

public class OtherUser  extends AbstractUserInfo {
	
	private boolean offlineFlag;
	private String registerDate;
	private InetAddress ipAddr; 
	private int port;
	private String uString; 
	private String mString;
	
	
	public String getuString() {
		return uString;
	}

	public void setuString(String uString) {
		this.uString = uString;
	}

	public String getmString() {
		return mString;
	}

	public void setmString(String mString) {
		this.mString = mString;
	}

	public OtherUser(String userID, String pseudo, String regDate, InetAddress ipA, int prt, String uS, String mS) {
		super(userID, pseudo);
		offlineFlag = true;
		registerDate = regDate;
		ipAddr = ipA;
		port = prt;
		uString = uS;
		mString = mS;
	}
	
	public OtherUser(String userID, InetAddress ipA, int prt) {
		super(userID, null);
		
		registerDate = null;
		ipAddr = ipA;
		port = prt;
	}
	
	public InetAddress getInetAddr() {
		return ipAddr;
	}
	
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	
	public void setAddr(InetAddress addr, int p0rt) {
		ipAddr = addr;
		port = p0rt;
	}
	
	public int getPort()
	{
		return port;
	}
	
	public boolean getFlag() {
		return offlineFlag;
	}
	
	public void setFlag(boolean b) {
		offlineFlag = b;
	}
	
	
	public String toString()
	{
		return "User ip: <"+ this.getInetAddr() +"> port : "+ this.getPort();
		
	}

}
