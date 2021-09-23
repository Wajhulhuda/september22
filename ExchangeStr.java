package september22;

public class ExchangeStr {
	public static void main(String [] args) {
		String string = "Geekster makes a career";
		String word[] = string.split(" ");
		int length = word.length;
		String revStr="";
		for(int i=length-1; i>=0; i--) {
			revStr = revStr+" "+ word[i];
			
		}
		System.out.println(revStr);
	}
}
