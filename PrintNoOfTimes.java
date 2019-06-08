import java.util.Scanner;

public class PrintNoOfTimes {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String rep="";
		String p="";
		int j=0;
		for(int i=0;i<str.length();i++){
			p="";
			if(str.charAt(i)>='0' &&str.charAt(i)<='9'){
				p+=str.charAt(i);
			}
			else{
				j=i;
				continue;
			}
			int val=Integer.parseInt(p);
			
			for(int k=0;k<val;k++){
				rep=rep+str.substring(j,j+1);
			
			}
			
		}
		System.out.println(rep);
	}
	}
