package javabasics;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a name:");
		String name=scan.next();
		System.out.println("\"Hello,"+name+"\"");
		scan.close();
	}

}
