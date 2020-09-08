
public class Test {
	public static void main(String[] args) {
		String str = "abcabc";
		int len =stringSuffix(str);
		System.out.println("Len : "+len);
	}
	
	public static int stringSuffix(String str) {
		int ans =-1;
		int len = str.length();
		String prefix=null;
		String postFix=null;
		int start=0;
		int last = 0;
		int size = len;
		while(start!=size/2) {
			while(start!=len/2) {
				prefix = str.substring(0, start+1);
				start++;
				break;
			}
			
			while((len-last)!=len/2) {
				postFix = str.substring(len-1-last);
				last++;
				break;
			}
			System.out.println("Prefix :"+prefix + "||postFix : "+postFix);
			if(prefix.equals(postFix)) {
				 ans = prefix.length();
			 }
			
		}
		return ans;
	}
}
