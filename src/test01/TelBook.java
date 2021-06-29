package test01;

public class TelBook {
	private String name;
	private int TelNum;
	private String email;
	private int birth;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTelNum(int TelNum) {
		this.TelNum = TelNum;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setbirth(int birth) {
		this.birth = birth;
	}
	/////////////////////////////////////////
	public String getName() {
		return this.name;
	}
	public int getTelNum() {
		return this.TelNum;
	}
	public String getemail() {
		return this.email;
	}
	public int getbirth() {
		return this.birth;
	}
}
