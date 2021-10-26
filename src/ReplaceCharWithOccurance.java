
public class ReplaceCharWithOccurance {

	public static void main(String[] args) {

		String s = "java";
		char charToReplace = 'a';
		int cnt = 1;
		
		for(int i=0; i<s.length(); i++) {//j
			char ch = s.charAt(i);
			if(ch == charToReplace) {
				s = s.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(s);
	}

}
