import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		String str = "amit AMIT KUMAR BABU";
		vowelsConsonantCount(str);
		
	}
	
	public static void vowelsConsonantCount(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		int vCount=0,cCount=0;
		for (char c : ch) {
			if(c != ' ') {
				if(Pattern.matches("[aeiouAEIOU]", Character.toString(c))) {
					vCount++;
				}else {
					cCount++;
				}
			}
		}
		System.out.println("C:"+cCount);
		System.out.println("v : "+vCount);
	}
}
