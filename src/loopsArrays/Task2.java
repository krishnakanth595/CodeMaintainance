package loopsArrays;

import java.util.Scanner;

public class Task2 {

	public static boolean isPalindrome(int num) {
		int n,sum=0,temp,r;
		n=num;
		temp=num;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) 
			return true; 
		return false; 

	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		int num=scan.nextInt();
		System.out.println(isPalindrome(num));
		scan.close();
	}

}
