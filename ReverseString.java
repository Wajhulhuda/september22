package september22;

public class ReverseString {
	
	public static void main(String [] args) {
		String str = "Java is better than python";
		String reversed = ReverseStr(str);
		System.out.println(reversed);
	}
	
	
	public static String ReverseStr(String str) {
		String reversestr="";
		int length = str.length();
		for(int i=length-1; i>=0; i--) {
			reversestr += str.charAt(i);
		}
		return reversestr;
	}

}
