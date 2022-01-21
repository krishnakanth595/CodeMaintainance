package languageconstructs;

public class Task7 {

	public static int sumLimit(int a, int b) {
		String str1 = ""+(a+b);
		String str2 = ""+a;
		if(str1.length() == str2.length())
		return a+b;
		else
		return a;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumLimit(9,3));
	}

}
