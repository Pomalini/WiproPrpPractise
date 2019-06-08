import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			String ana=scan.next();
			int count=0;
			char a[]=str.toCharArray();
			char b[]=ana.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i]){
					count=1;
				}
			}
			if(count==0){
				System.out.println("Anagram");
			}
			else{
				System.out.println("not anagram");
			}
			
		
		
		}
	}


