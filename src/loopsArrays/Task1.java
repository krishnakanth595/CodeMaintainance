package loopsArrays;

import java.util.Scanner;

public class Task1 {

	public static void getPyramid(int num, int x) {
		int temp=0;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp=temp+x;
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		int num,x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		num=scan.nextInt();
		System.out.println("Enter value for x:");
		x=scan.nextInt();
		getPyramid(num,x);
		scan.close();
	}

}
