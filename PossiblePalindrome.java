import java.util.Scanner;

public class PossiblePalindrome {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String p="";
		StringBuffer sb=new StringBuffer(str);
		String rev=sb.reverse().toString();
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				if(i==j){
				if(str.charAt(i)!=rev.charAt(j)){
					p+=str.charAt(i);
				}
			}
			}
		}
		System.out.println(p.charAt(0));
	}

}
