package modelclass;

public class registermodel {
	private int uid;
	private String Fname;
	private String Lname;
	private String Mail;
	private String Phone;
	private String Address;
	private String Password;
	public registermodel() {
		// TODO Auto-generated constructor stub
	}
	public registermodel(String fname, String lname, String mail, String phone, String address, String password) {
		super();
		Fname = fname;
		Lname = lname;
		Mail = mail;
		Phone = phone;
		Address = address;
		Password = password;
	}
	public registermodel(int uid, String fname, String lname, String mail, String phone, String address,
			String password) {
		super();
		this.uid = uid;
		Fname = fname;
		Lname = lname;
		Mail = mail;
		Phone = phone;
		Address = address;
		Password = password;
	}
	public registermodel(String mail, String password) {
		super();
		Mail = mail;
		Password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
