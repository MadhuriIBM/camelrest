
public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String s = "Java code";
		String[] words = s.split(" ");
		String op = " ";
		
		for(String word:words) {
			String rev = " ";
			for(int i=word.length()-1;i>=0;i--) {
				rev = rev+ word.charAt(i);
			}
			op = op+rev+" ";
		}
		System.out.println(op);
	}

}
