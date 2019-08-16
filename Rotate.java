import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int b[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            b[j]=a[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            b[j]=a[i];
            j++;
        }
        for(int x:b){
            System.out.println(x);
        }
        
        

    }


	}


