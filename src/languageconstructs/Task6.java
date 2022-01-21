package languageconstructs;

public class Task6 {

	public static boolean shareDigit(int a, int b) {
		  return a/10==b/10||a%10==b%10||a%10==b/10||a/10==b%10;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shareDigit(12,23));
	}
}
