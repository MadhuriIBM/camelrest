import java.util.Arrays;
import java.util.HashMap;

public class RemoveDupArrayElements {

	public static int[] removeDups(int[] a) {
		
		Arrays.sort(a);
		int []a1= new int[5];
		int j = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++] = a[i];//
			}
		}
		a[j++] = a[a.length-1];  //1,2,4,5,6  j=5
		
		for(int k=0;k<j;k++) {
			//a1= a[k];   //System.out.println(a[k]);
		}
		return a;
		
	}
	public static void main(String[] args) {

		int []a = {1,1,2,3,3,4,5};
		System.out.println(removeDups(a));
		
		//Arrays.sort(a);  //1,1,2,2,4,5,5,6
		
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else
				map.put(a[i], 1);
			
		}
		map.forEach((k, v) ->System.out.print(k+" "));*/
		
		int j = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++] = a[i];//
			}
		}
		a[j++] = a[a.length-1];  //1,2,4,5,6  j=5
		
		for(int k=0;k<j;k++) {
			//System.out.println(a[k]);
		}
		
	}

}
