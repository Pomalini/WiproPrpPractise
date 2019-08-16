

import java.util.Scanner;

public class ReducedSub {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		while(a>10){
			String res="";
			String s=""+a;
			for(int i=0;i<s.length()-1;i++){
				res+=Math.abs(Integer.parseInt(s.charAt(i)+"")-(Integer.parseInt(s.charAt(i+1)+"")));
				
			}
			a=Integer.parseInt(res);
		}
		System.out.println(a);
		}
	}


