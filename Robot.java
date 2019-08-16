import java.util.Scanner;

public class Robot {
	public static String Currpos(String pos,String x){
	
			if(pos.equals("E")){
				if(x.contains("R")){
				x="S";	
				}
				if(x.contains("L")){
					x="N";
				}
			}
			if(pos.equals("W")){
				if(x.equals("R")){
				x="N";	
				}
				if(x.equals("L")){
					x="S";
				}
			}
			if(pos.equals("N")){
				if(x.equals("R")){
				x="E";	
				}
				if(x.equals("L")){
					x="W";
				}
			}
			if(pos.equals("S")){
				if(x.equals("R")){
				x="W";	
				}
				if(x.equals("L")){
					x="E";
				}
			}
			return x;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		scan.next();
		int arr[][]=new int[x][y];
		String s1=scan.nextLine();
//		String a[]=s1.split("-");
		String a=s1.replace("-","");
		String s2=scan.nextLine();
		String ss[]=s2.split(" M");
//		System.out.println(ss.length);
//		System.out.println(ss[0]+" "+ss[1]);
//		int x1=Integer.parseInt(a[0]);
//		int y1=Integer.parseInt(a[1]);
		System.out.println(a.charAt(0)+" "+a.charAt(1)+" "+a.charAt(2));
		int x1=2;
		int y1=2;
//		String pos=a[2];
		String pos="E";
		String res="";
		
		
		System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
		int i=x1;
		int j=y1;
		for(int k=0;k<ss.length;k++){
				
				if(Currpos(pos,ss[k]).equals("S")){
					j=j+1;
					pos="S";
					
				}
				else if(Currpos(pos,ss[k]).equals("N")){
					j=j-1;
					pos="N";
				}
				else if(Currpos(pos,ss[k]).equals("W")){
					i=i-1;
					pos="W";
				}
				else{
					i=i+1;
					pos="E";
				}
				//System.out.println(i+","+j+" "+pos);
			}
		if(i>=x &&j<=y){
			System.out.println(i+" "+j+" "+pos);
		}
		else{
			System.out.println(i+" "+j+" "+"ER");
		}
	}
		
			
	}

