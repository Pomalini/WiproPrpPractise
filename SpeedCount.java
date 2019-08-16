import java.util.Scanner;

public class SpeedCount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int s=0;
		int r=0;
		int res=0,val=0;
		int count=0;
		while(res<=n1){
		count++;
		r=n2/4;
		res=(r+n2);
			if(res==n1){
				System.out.println(count);
				val=0;
				break;
			}
			else{
				n2=(r+n2);
				val++;
			}
		}
		if(val>0){
		System.out.println(count);
	}
	}

}
