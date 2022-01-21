package variabletask;

public class Task1 {
	
	public static int getAppleCount(int dan,int amb) {
		int count=dan+amb;
		return count;
	}
	public static double getAppleCount(double dan,double amb) {
		double count=dan+amb;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=3,amb=2;
		double danny=3.5,amby=2.5;
		System.out.println("Total="+getAppleCount(dan,amb));
		System.out.println("Total="+getAppleCount(danny, amby));
	}

}
