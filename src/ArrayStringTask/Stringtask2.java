package ArrayStringTask;

public class Stringtask2 {

	 static boolean isRotation(String str1, String str2)
	    {
		 String temp=str1+str1;
	     if(str1.length() == str2.length() && temp.contains(str2)) {
	    	 return true;
	     } 
		 return false;
	    }
	  
	    // Driver method
	    public static void main(String[] args)
	    {
	        String str1 = "abcde";
	        String str2 = "deabc";
	        System.out.println(isRotation(str1, str2));
	        
	    }

}
