package logic;

import java.util.Scanner;

public class RepChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String tr="";
		for(int i=0;i<str.length();i++){
		if(!tr.contains(str.substring(i,i+1))){
			tr+=str.substring(i,i+1);
		}
		}
		int count=0;
		for(int i=0;i<tr.length();i++){
			count=0;
			for(int j=0;j<str.length();j++){
				if(tr.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			System.out.println(tr.charAt(i)+"-->"+count);
		}
	}

}
