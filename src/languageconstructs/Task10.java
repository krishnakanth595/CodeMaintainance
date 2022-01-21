package languageconstructs;

public class Task10 {

	public static int sumofDigit(String str)
	{	        
		String temp="0";	 
		int sum = 0;	        
		for (int i = 0; i < str.length(); i++) {	            
			if (Character.isDigit(str.charAt(i))) {
				temp =temp+str.charAt(i);	
				if(i==str.length()-1) {
					sum += Integer.parseInt(temp);
				}
			}
			else {                
				sum += Integer.parseInt(temp);
				temp = "0";
			}			
		}
		return sum;
	}
	public static void main(String[] args)
	{
		String str = "ab5c7tt89tt";
		System.out.println(sumofDigit(str));
	}

}
