import java.util.*;

 public class RemoveDupUnsorted
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner scan=new Scanner(System.in);
	 
	     int n=scan.nextInt();
	     int a[]=new int[n];
	     int b[]=new int[n];
	     for(int i=0;i<n;i++){
	         a[i]=scan.nextInt();
	         b[i]=a[i];
	     }
	     int flag=0;
	     for(int i=0;i<n;i++){
	    	 
	    	 for(int j=0;j<n;j++){
	    		 if(a[i]==b[j]){
	    			 if(i>j){
	    				 break;
	    			 }
	    			 if(i==j){
	    				 System.out.print(a[i]+" ");
	    				 
	    			 }
	    		 }
	    		 
	    	 }
	     }
	     
	 }
	 
}
