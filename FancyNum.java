package logic;

import java.util.Scanner;


public class FancyNum {
public static boolean cons(String x){
char c[]=x.toCharArray();
boolean flag=false;
for(int i=0;i<c.length-1;i++){
if(c[i]==c[i+1] && !(i==c.length-2)){
if(c[i+1]==c[i+2]){
flag=true;
}
}

}
return flag;

}
public static boolean asdes(String x){
char c[]=x.toCharArray();
boolean flag=false;
for(int i=0;i<c.length-1;i++){
if(c[i]==(c[i+1]+1) && !(i==c.length-2)){
if(c[i+1]==(c[i+2]+1)){
flag=true;
}
}
if(c[i]==(c[i+1]-1)){
if(c[i+1]==(c[i+2]-1)){
flag=true;
}
}


}
return flag;
}
public static boolean rep(String x){
char c[]=x.toCharArray();
boolean flag=false;
int count=0;
for(int i=0;i<c.length;i++){
count=0;
for(int j=0;j<c.length;j++){
if(c[i]==c[j]){
count++;
}
}
if(count==4){
flag=true;
break;
}

}
return flag;

}

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String num=scan.next();
boolean val1=true,val2=true,val3=true;
if(num.length()==10){
if(FancyNum.cons(num)){
System.out.println("Your number is Fancy,it satisfies the 1st condition");

}
else{
val1=false;
}
if(FancyNum.asdes(num)){
System.out.println("Your number is Fancy,it satisfies the 2nd condition");
}
else{
val2=false;
}
if(FancyNum.rep(num)){
System.out.println("Your number is Fancy,it satisfies the 3rd condition");
}
else{
val3=false;
}
}
else{
System.out.println("Invalid Phone number");
}
if(val1&&val2&&val3 && !(val1&&val2&&val3)){
System.out.println("Your number is not fancy");
}


}

}
