package Pckggit;
import java.util.Scanner;

public class MatrixOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows in matrix ");
		int rows=sc.nextInt();
		System.out.print("Enter the number of cols in matrix ");
		int cols=sc.nextInt();
		int[][] matA=new int[rows][cols];
		int[][] matB=new int[rows][cols];
		int[][] sums=new int[rows][cols];
		System.out.print("Enter the values for matrix A");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matA[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the values for matrix B");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matB[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of A and B");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sums[i][j]=matA[i][j]+matB[i][j];
				System.out.print(sums[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
