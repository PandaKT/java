import java.util.*;
class PositiveOrNegative{
public static void main(String[]args){
int n;
Scanner scan = new Scanner(System.in);	
System.out.println("Enter the No");
n = scan.nextInt();
if(n>=0){
System.out.println(n +" is Positive no");
}
else{
System.out.println(n +" is negative no");
}
}
}