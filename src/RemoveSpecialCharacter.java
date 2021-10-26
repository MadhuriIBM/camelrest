
public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String s= "Mad&^%hu";
		String s1= "M a dh u ";
		
		String str = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
		String str1 = s1.replaceAll(" ", "");
		System.out.println(str1);
	}

}
