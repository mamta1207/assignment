import java.util.Scanner;
class Vowels
{
public static void main(String args[])
{
String str,str1="";
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'
&&ch!='E'&&ch!='O'&&ch!='U')
{
str1=str1+ch;
}
}
System.out.println(str1);
}
}