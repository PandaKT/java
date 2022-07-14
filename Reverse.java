import java.util.*;
class Reverse{
public static void main(String[]args){
int n;
Scanner scan = new Scanner(System.in);	
System.out.println("Enter the No");
n = scan.nextInt();
System.out.print("Reverse is ");
while(n>0){
System.out.print(n%10 + "  ");
n/=10;
}
}
}
	