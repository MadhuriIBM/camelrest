import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TrasfromDataFromLowerToUppercase {
	
	public static String toUpperCase(String s) {
		
	StringBuffer s2= new StringBuffer();
	
	for(int i=0;i<s.length();i++) 
	{
		int asci = s.charAt(i) - 32;
		char ch1 = (char)asci;
		s2 = s2.append(ch1);
	}
	return s2.toString();
	}

	public static void main(String[] args) {

		System.out.println(toUpperCase("madhu"));
		
		
		/*List<String> list = new ArrayList<String>();
		list.add("madhu");
		list.add("suraj");*/
		
	//	list.stream().map(f-> f.toUpperCase()).forEach(f->System.out.println(f));
		//System.out.println(list1);
		
		
		//String s = "abc";
		
	
		
		String s1 = "madhu";
		StringBuffer sb = new StringBuffer(s1);
		for(int i=0;i<sb.length();i++) {
			if(Character.isLowerCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				break;
			}
		}
		//System.out.print(sb);
		
	}
}