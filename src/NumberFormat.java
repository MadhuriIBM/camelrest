
public class NumberFormat {
	
	public static double updateNumber(double num) {
		
		//String formateStr = String.format("%017.2f", num);
		//System.out.println(formateStr1);
		double d = Math.round(num*100.0)/100.0;
		return d;
		
		
		
	}

}
