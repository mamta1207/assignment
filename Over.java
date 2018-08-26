class over
{
public void display(String a)
{
System.out.pritntln(a);
}
public void display(int a)
{
System.out.println("integer no: "+a");
}
public void display(float a)
{
System.out.println(float no: "+a);
}
}
class overloading {
public static void main(String[] args) {
over o=new over();
o.display(null);
o.display(10);
o.display(10.24f);
}
}