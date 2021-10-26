
public class RemoveDupStringElements {

	public static void main(String[] args) {

		String s= "madhumah";
		char[] a =s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {//M 
			boolean repeated = false;
			for(int j=i+1;j<s.length();j++) {//d h u m a
				if(a[i]==a[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
		
	}

}
