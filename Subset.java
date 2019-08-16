

import java.util.Scanner;

public class Subset {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=scan.nextInt();
		}
		int count=0,val=0;
		
		for(int i=0;i<m;i++){
			count=0;
			for(int j=0;j<n;j++){
				if(b[i]==a[j]){
					count++;
					System.out.println(count);
					
				}
				
			}
			if(count>=1){
				val++;
			}
			else{
				val=0;
				break;
			}
		}
		
		if(val>0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
	}

}
