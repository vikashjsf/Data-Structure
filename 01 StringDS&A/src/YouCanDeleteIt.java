import java.util.regex.Pattern;

public class YouCanDeleteIt {
	public static void main(String[] args) {
		String str = "My eclipse is working";
		System.out.println("Given Number is :"+str);
		System.out.println(reversUsingRecursion(str));
		consonatVolelCount(str);
	}
	
	
	private static String reversUsingRecursion(String str) {
		if(str.length()<2) {
			return str;
		}
		return reversUsingRecursion(str.substring(1))+str.charAt(0);
	}


	public static void consonatVolelCount(String str) {
		int vCount=0,cCount=0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if(Pattern.matches("[aeiou]",Character.toString(ch))) {
				vCount++;
			}else {
				cCount++;
			}
		}
		System.out.println("vowel : "+vCount + " Consonant : "+cCount);
	}
}
