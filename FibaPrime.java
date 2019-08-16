import java.util.Scanner;

public class FibaPrime {
	public static boolean Prime(int x){
		
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print(1+" "+2+" "+1+" ");
		int val=n-1;
		int a=1,b=1;
		int c=0;
		int p=3;
		for(int i=3;i<n;i++){
			
			if(i%2==0){
			
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			if(i%2==1){
				
				while(!Prime(p)){
					p=p+1;
					Prime(p);
				}
				if(Prime(p)){
					System.out.print(p+" ");
					p=p+1;
				}
				
			}
		}
//1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, …
		
	}
}


