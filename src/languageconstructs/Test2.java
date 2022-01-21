package languageconstructs;

public class Test2 {

	public static boolean isSix(int a, int b) {
				
		if(a==6 || b==6 || Math.abs(a+b)==6 || Math.abs(a-b)==6) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSix(3,-9));
	}

}
