import java.util.Scanner;
class fun{
	public void uppercase(String x,String y){
//		String c[]=new String[2];
//		c[0]=x.toUpperCase();
//		c[1]=y.toUpperCase();
//		return c;
		x=x.toUpperCase();
		y=y.toUpperCase();
		System.out.println(x+"  "+y);
	}
	public void lowercase(String x,String y){
//		String c[]=new String[2];
//		c[0]=x.toLowerCase();
//		c[1]=y.toLowerCase();
//		return c;
		x=x.toLowerCase();
		y=y.toLowerCase();
		System.out.println(x+"  "+y);
	}
	
	
	
	
}
public class FuncCall {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter input string");
		String str=scan.next();
		fun obj=new fun();
		
		String v="";
		String c="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				v+=str.charAt(i);
			}
			else if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
			continue;
				
			}
		
			else{
				c+=str.charAt(i);
			}
		}
		System.out.println("Enter choice 1-->uppercase... 2-->lowercase");
		int choice=scan.nextInt();
		switch(choice){
		case 1:
			obj.uppercase(v,c);
			
			break;
		case 2:
			obj.lowercase(v,c);
		
			break;
			default:
				System.out.println("invalid");
		}
	}

}
