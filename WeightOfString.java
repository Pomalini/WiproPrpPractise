

import java.util.Scanner;

public class WeightOfString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[26];
		String str=scan.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<26;i++){
			arr[i]=scan.nextInt();
		}
		String word="";
		int sum=0,pro=1;
		int val=0,count=0,add=0;
		String alpha="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<s.length;i++){
			sum=0;
			add=0;
			for(int j=0;j<s[i].length();j++){
				word=s[i].toLowerCase();

				for(int l=0;l<26;l++){
					if(word.charAt(j)==alpha.charAt(l)){
						val=l;
						count++;
					}
					if(count>=1){
						if((j==0||j==s[i].length()-1) && arr[val]<0){
							sum=(arr[val]+(val+1));
						}
						else{
							sum=arr[val];
						}

					}
				}
				System.out.println(word.charAt(j) +" "+sum);
				add+=sum;
				

			}
			System.out.println(add);
			pro*=add;


		}
		System.out.println(pro);

	}
}
