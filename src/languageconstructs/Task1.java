package languageconstructs;

public class Task1 {

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		  if(isBirthday){
		    if(speed <= 65){
		      return 0;
		    } else if(speed >= 66 && speed <= 85){
		      return 1;
		    } else{
		      return 2;
		    }
		  } else{
		    if(speed <= 60){
		      return 0;
		    } else if(speed >= 61 && speed <= 80){
		      return 1;
		    } else{
		      return 2;
		    }
		  }
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caughtSpeeding(65,true));
	}

}
