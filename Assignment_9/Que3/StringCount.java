import java.util.StringTokenizer;

public class StringCount {
	void checkCount() {
		String str="The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";
		StringTokenizer s1=new StringTokenizer(str,",");
		while(s1.hasMoreTokens()) {
			//System.out.println(s1.nextToken());
			System.out.println(s1.countTokens());
		}
}
}
