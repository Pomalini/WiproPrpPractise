package logic;

import java.util.Scanner;

public class TraverseMatrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			if(i%2==0){
			for(int j=n-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			else{
				for(int j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		

}
}
