package languageconstructs;

public class Task3 {
	
	public static int teaParty(int tea, int candy) {		  
		  if(tea>=5 && candy>=5)
		    if(tea>=(2*candy) || (2*tea)<=candy)
		      return 2;
		    else
		    return 1;
		    
		  return 0;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(teaParty(20,6));
	}

}
