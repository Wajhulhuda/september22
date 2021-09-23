package september22;

public class ReverseWordString {
	
	public static void main(String [] args) {
		String string = "Python is better than java";
		String reverse[] = string.split(" ");
		String reversedStr = "";
		
		for(int i=0; i<reverse.length; i++) {
			String str = WordRevStr(reverse[i]);
			reversedStr = reversedStr +" "+ str;
			
		}
		System.out.println(reversedStr);
	}
	
	public static String WordRevStr(String str) {
		String revStr = "";
		int length = str.length();
		for(int i=length-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}

}
