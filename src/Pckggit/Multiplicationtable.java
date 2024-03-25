package Pckggit;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for its multiplication");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}	
	}
}
