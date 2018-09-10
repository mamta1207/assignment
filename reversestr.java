import java.util.Scanner;
class Reversestr
{
public static void main(String args[])
{
int len;
String str,rev="";
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
len=str.length();
for(int i=len-1;i>=0;i--)
{
  rev=rev+str.charAt(i);
}
System.out.println(rev);
}
}