package ArrayStringTask;

import java.util.HashSet;

public class Stringtask1 {
	public static void checkDuplicate(String str) {
		String s = str.toLowerCase();
		char[] c = s.toCharArray();
		int count=1;
		HashSet<Character> dupe = new HashSet<Character>();	
		for(int i=0;i<s.length();i++) {
			char ch = c[i];
			for(int j=i+1;j<s.length();j++) {
				if(ch==c[j]) {
					count++;
				}
			}
			if(count>1) {
				dupe.add(ch);
			}
			count=1;
		}
		System.out.println(dupe);
	}
	public static void main(String[] args) {
		String str="helloworld";
		checkDuplicate(str);
	}
}
