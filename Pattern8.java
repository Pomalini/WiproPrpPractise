import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int len=(2*n)-1;
		for(int i=1;i<=len;i++){
			for(int j=1;j<=len;j++){
				if(i==1||j==1 ||i==len ||i==n||j==len){
					System.out.print("X");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
