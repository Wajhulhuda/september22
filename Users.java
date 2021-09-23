package september22;

public class Users {
	
	private int userId;
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String userCity;
	
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public void setuserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	
	public void setuserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	public void setuserCity(String userCity) {
		this.userCity = userCity;
	}
	
	
	public int getuserId() {
		return userId;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public String getuserFirstName() {
		return userFirstName;
	}
	
	public String getuserLastName() {
		return userLastName;
	}
	
	public String getuserCity() {
		return userCity;
	}

}
