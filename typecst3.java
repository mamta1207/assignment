import java.util.Scanner;
public final class typecst3{
public static void main(String args[]){
String a,b;
int c,d;
Scanner sc =new Scanner(System.in);
a=sc.next();
b=sc.next();
c=Integer.parseInt(a);
d=Integer.parseInt(b);
if(c>d) System.out.println("Biggest No is : "+c);
else
System.out.println("Biggest No is : "+d);
}
}
