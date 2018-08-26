class StaticBlock
{
static int num;
static String str;
static
{
System.out.println("block 1")
num=16;
str="block1"
}
static{
System.out.println("block 2");
num=18;
str="block2";
}
public static void main(String args[])
{
System.out.println("num " +num);
System.oot.println("string " +str);
}
}
