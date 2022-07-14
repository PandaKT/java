import java.util.*;
class SumOfDigits{
public static void main(String[]args){
int n,k,sod=0;
Scanner scan = new Scanner(System.in);	
System.out.println("Enter the No");
n = scan.nextInt();
while(n>0){
k=n%10;
sod=sod+k;
n=n/10;
}
System.out.println("sum of digits is " + sod); 
}
}
