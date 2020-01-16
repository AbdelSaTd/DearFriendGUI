package gui;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.UnresolvedAddressException;


public class CurrentUser extends AbstractUserInfo {
	
	String hashedPassword; 
	Date registerDate;
	boolean isSetUp;
	InetAddress addr;
	int port;
	String myUstring=""; 
	String myMstring="";
	
	private InetAddress localBroadcastAddr;
	private InetAddress localHostAddr;

	public String getMyUstring() {
		return myUstring;
	}

	public void setMyUstring(String myUstring) {
		this.myUstring = myUstring;
	}

	public String getMyMstring() {
		return myMstring;
	}

	public void setMyMstring(String myMstring) {
		this.myMstring = myMstring;
	}
	
	public CurrentUser() throws UnresolvedAddressException {
		super("none", "none");
		isSetUp = false;
		//ArrayList<InetAddress> addrs = NetworkManager.getLocalAddr();
		//localHostAddr = addrs.get(0);
		//localBroadcastAddr = addrs.get(1);
	}
	
	public CurrentUser(String userid, String pseudo, String hashedPassword, Date registerDate) throws UnknownHostException {
		super(userid, pseudo);
		this.hashedPassword = hashedPassword;
		this.registerDate = registerDate;
		isSetUp = true;
		
		
		//Get the current ip address
	//	ArrayList<InetAddress> addrs = NetworkManager.getLocalAddr();
	//	localHostAddr = addrs.get(0);
	//	localBroadcastAddr = addrs.get(1);
	}
	
	public InetAddress getLocalHostAddr() {
		return localHostAddr;
	}
	
	public InetAddress getLocalBroadcastAddr() {
		return localBroadcastAddr;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String toString()
	{
		return "Current pseudo: " + this.pseudo + " User id : " + this.userid;
		
	}
}
