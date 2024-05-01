
public class PalindromString {
	
	public void checkPalindrom(String s) {
		StringBuffer sb1=new StringBuffer(s);
		
		String s1=new String(sb1.reverse());
			if(s.equals(s1)) {
				System.out.println("String is Palindrom");
			}
			else {
				System.out.println("String is not Palindrom");
			}
		
	}
}
