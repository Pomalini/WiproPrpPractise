import java.util.Scanner;

public class WatermelonEvenSplit {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int w=scan.nextInt();
		if(w>=1 && w<=100){
		if(w%2!=0){
			System.out.println("NO");
		}
		else{
			if((w/2)%2==0){
				System.out.println("YES");
				System.out.println(w/2+" "+w/2);
			}
			else{
				System.out.println("Even formation "+((w/2)+1)+" "+((w/2)-1));
			}
		}
	}
	
	else{
		System.out.println("invalid");
	}
	}

}
