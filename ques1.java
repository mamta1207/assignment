class A 
{
void func()
{
System.out.println("This is a Parent class");
}
}
class B extends A
{
void func()
{
System.out.println("This is a child class");
}
void fun()
{
System.out.println("Calling parent class");
}
void display()
{
fun();
super.fun()
}
}
class ques1
{
public static void main(String args[])
{
B n=new B();
n.display();
}
}