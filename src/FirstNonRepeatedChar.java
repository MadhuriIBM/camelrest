
public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String s = "mamadh";
		
		for(int i=0;i<s.length();i++) {//m a d h 
			boolean repeated = false;
			
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)== s.charAt(j) && i!=j) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
