import java.util.regex.Pattern;

public class ReveseString {
	public static void main(String[] args) {
		String str = "gfedcba";
		//sortStirng(str.toLowerCase().toCharArray());
		
		//String str = "abc";
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		boolean status = pattern.matcher(str).matches();
		System.out.println(status);
		System.out.println("done");
		
		
	}

	private static void sortStirng(char[] charArray) {
		int len = charArray.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1 ; j < len; j++) {
				if(charArray[i] > charArray[j]) {
					{	char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println("Sorted String are  :"+String.valueOf(charArray));
	}
}
}
