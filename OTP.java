import java.util.Scanner;

public class OTP {
	public static long add(long x){
		String n=""+x;
		StringBuffer sb=new StringBuffer(n);
		String no=sb.reverse().toString();
		long num=Long.parseLong(no);
		long count=0,r=0,sum=0;
		while(count<5){
			r=num%10;
			sum=sum+r;
			num=num/10;
			count++;
			
		}
		return sum;
	}
	public static long sum(long y){
		String n=""+y;
		long plus=0;
		for(int i=5;i<n.length()-1;i++){
			plus+=Long.parseLong(String.valueOf(n.charAt(i)));
		}
		return plus;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		long accno=scan.nextLong();
		long acc=accno;
		String type=scan.next();
		String otp="";
		otp+=type.substring(0,2);
		String no=accno+"";
		otp+=no.substring(0, 1);
		long res=OTP.add(accno);
		
		if(res>9){
			res=OTP.add(res);
			otp+=res;
		}
		else{
			otp+=res;
		}
		otp+=name.substring(0,1);
		long res2=OTP.sum(acc);
		if(res2>9){
			res2=OTP.add(res2);
			otp+=res2;
		}
		else{
			otp+=res2;
		}
		otp+=name.substring(name.length()-1);
		String a=""+acc;
		otp+=a.substring(a.length()-1);
		System.out.println(otp);
	}

}
