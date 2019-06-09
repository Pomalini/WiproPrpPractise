import java.util.Scanner;


public class FancyNum {
	public static boolean cons(String x){
		char c[]=x.toCharArray();
		boolean flag=false;
		for(int i=0;i<c.length-1;i++){
			if(c[i]==c[i+1] && !(i==c.length-2)){
				if(c[i+1]==c[i+2]){
					flag=true;
				}
			}
			
		}
		return flag;
		
	}
	public static boolean asdes(String x){
		char c[]=x.toCharArray();
		boolean flag=false;
		for(int i=0;i<c.length-1;i++){
			if(c[i]==(c[i+1]+1) && !(i==c.length-2)){
				if(c[i+1]==(c[i+2]+1)){
					flag=true;
				}
			}
			if(c[i]==(c[i+1]-1)){
				if(c[i+1]==(c[i+2]-1)){
					flag=true;
				}
			}
			
			
		}
		return flag;
	}
	public static boolean rep(String x){
		char c[]=x.toCharArray();
		boolean flag=false;
		int count=0;
		for(int i=0;i<c.length;i++){
			count=0;
			for(int j=0;j<c.length;j++){
				if(c[i]==c[j]){
					count++;
				}
			}
			if(count==4){
				flag=true;
				break;
			}
			
		}
		return flag;
		
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String num=scan.next();
		int val=0;
		if(num.length()==10){
		if(FancyNum.cons(num)){
			System.out.println("Your number is Fancy,it satisfies the 1st condition");
			
		}
		else{
			val=1;
		}
		if(FancyNum.asdes(num)){
			System.out.println("Your number is Fancy,it satisfies the 2st condition");
		}
		else{
			val=1;
		}
		if(FancyNum.rep(num)){
			System.out.println("Your number is Fancy,it satisfies the 3st condition");
		}
		else{
			val=1;
		}
		}
		else{
			System.out.println("Invalid Phone number");
		}
		if(val==1){
			System.out.println("Your number is not fancy");
		}
		
		
	}

}
