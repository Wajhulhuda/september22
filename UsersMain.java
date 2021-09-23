package september22;

public class UsersMain {
	
	public static void main(String [] args) {
		Users Wajhul = new Users();
		
		Wajhul.setuserId(1);
		Wajhul.setuserName("wajhul56");
		Wajhul.setuserFirstName("Wajhul");
		Wajhul.setuserLastName("Huda");
		Wajhul.setuserCity("Barabanki");
		
		System.out.println("User Id: "+Wajhul.getuserId());
		System.out.println("User Name : "+Wajhul.getuserName());
		System.out.println("User First Name : "+Wajhul.getuserFirstName());
		System.out.println("User Last Name : "+Wajhul.getuserLastName());
		System.out.println("User City : "+Wajhul.getuserCity());
	}

}
