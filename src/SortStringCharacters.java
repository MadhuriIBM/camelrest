import java.util.Arrays;

public class SortStringCharacters {

	public static void main(String[] args) {

		String s = "suraj";
		char[] ch = s.toCharArray();
		
		/*Arrays.sort(ch);
		System.out.println(ch);*/
		
		for(int i=0;i<s.length();i++) {//amdhu/admhu/adhmu
			
			for(int j=i+1;j<s.length();j++) {
				
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			System.out.print(ch[i]);
		}
	}

}
