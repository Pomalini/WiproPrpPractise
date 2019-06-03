import java.util.Scanner;

public class PrimeLimit {
	public static int Prime(int x){
		int flag=1;
		if(x==0 || x==1){
			flag=0;
		}
		else{
			for(int i=2;i<=x/2;i++){
				if(x%i==0){
				flag=0;	
				}
			}
		}
		if(flag==1){
			System.out.println(x);
		}
		return flag;
		
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++){
//			int val=PrimeNonPrime.Prime(i);
		if(PrimeLimit.Prime(i)==1){
			sum=sum+i;
		}
		}
		System.out.println(sum);
		
		
		
	}

}
