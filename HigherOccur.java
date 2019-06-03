import java.util.Scanner;

public class HigherOccur {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str="";
		int a[]=new int[10];
		int count=0;
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.next();
		}
		for(String x:arr){
			str=str+x;
		}
		for(int i=0;i<str.length();i++){
			count=0;
			for(int j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			a[Integer.parseInt(str.substring(i, i+1))]=count;
		}
		int max=a[0];
		int val=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>=max){
				max=a[i];
				val=i;
			
			}
		}
		System.out.println(val+"-->"+max);
		
		
		
		
	
		
	}

}
