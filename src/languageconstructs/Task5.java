package languageconstructs;

public class Task5 {
	
	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(bOk){
		    if(c>b)
		      return true;
		  }
		  else if(c>b && b>a)
		    return true;
		  return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inOrder(7,5,6,true));
	}

}
