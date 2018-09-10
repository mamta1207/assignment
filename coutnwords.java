import java.util.Scanner;
class Count
{
public static void main(String args[])
{
String str;
int count=0;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.substring(i,i+1).compareTo(" ")==0)
count++;
}
System.out.println(count+1);
}
}