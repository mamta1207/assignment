import java.util.*;
public class occur_string {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("enter the long string : ");
String x=sc.nextLine();int c=0;int a=x.length();
System.out.print("enter the small string : ");String y = sc.nextLine();int b=y.length();
for(int i=0;i<a;i++) if(i+b<=a && x.substring(i,i+b).compareTo(y)==0) c++;
if(c==0) System.out.println("small string not occured in long string");
else System.out.println(c+" time small String occured in long string");
}
}
 