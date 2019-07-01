
import java.util.Arrays;
import java.util.Scanner;

public class MissingFrom1ToN {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int count=0;
		Arrays.sort(a);
		for(int k=1;k<=n;k++){
			count=0;
		for(int i=0;i<n;i++){
			if(a[i]==k){
				count=0;
				break;
			}
			else{
				count++;
			}
			
		}
		if(count==n){
			System.out.println(k);
		}
		
	}
	}
}


