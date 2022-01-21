package languageconstructs;

public class Task9 {

	public static int blockSize(String str) {
		int count = 0,tempcount = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
				tempcount++;
			else
				tempcount = 1;
			if (tempcount > count)
				count = tempcount;
		}
		return count;
	}
	public static void main(String[] args) {

		String str = "ab5555c7ttt89tt";
		System.out.println(blockSize(str));
	}
}
