package Pckggit;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int num=sc.nextInt();
		int n=num;//123
		int reverse=0;
		while(n!=0) {
			reverse=reverse*10;
			System.out.println(reverse);
			reverse=reverse+(n%10);
			n=n/10;
		}
		System.out.println("Reverse of a number is "+reverse);
		if(reverse==num) {
			System.out.println(num+" is a Palindome Number");
		}
		else {
			System.out.println(num+" is a not Palindome Number");
		}

	}

}
