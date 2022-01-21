package javabasics;

import java.util.Scanner;

public class Task2 {
	public static void calculator(double num1,double num2,char operator) {
		switch(operator) {

		case '+':
			System.out.printf("%f + %f = %f",num1,num2,(num1+num2));
			break;

		case '-':
			System.out.printf("%f - %f = %f",num1,num2,(num1-num2));
			break;

		case '/':
			if(num2!=0) {
				System.out.printf("%f / %f = %f",num1,num2,(num1/num2));
			}
			else System.out.println("Division by zero not possible");
			break;

		case '%':
			if(num2!=0) {
				System.out.printf("%f %% %f = %f",num1,num2,(num1%num2));
			}
			else System.out.println("Division by zero not possible");
			break;

		case '*':
			System.out.printf("%f * %f = %f",num1,num2,(num1*num2));
			break;
		
		case 'p':
			if(num2!=0) {
				System.out.printf("percentage of %f and %f = %f",num1,num2,((num1/num2)*100));
			}
			else System.out.println("Division by zero not possible");
			break;
			
		default:
			System.out.println("Enter only the above mentioned operator for calculation...");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator;
		double num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one of these operator +,-,/,%,* and p for percentage:");
		operator=scan.next().charAt(0);
		System.out.println("Enter two numbers:");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		calculator(num1,num2,operator);
		scan.close();

	}
}
