import java.util.*;
class RetainElements{
  public void addi(Set<Integer>s){
    Scanner o=new Scanner(System.in);
    System.out.println("enter elements of set and -1 to exit");
   int a=o.nextInt();
    while(a!=-1)
    { 
      s.add(a);
      a=o.nextInt();
    }
  }
  public static void main(String []args)
  {
    int a;
    RetainEle m=new RetainEle();
    
    Set<Integer> s=new HashSet<Integer>();
    Set<Integer> s1=new HashSet<Integer>();
    m.addi(s);
    m.addi(s1);
    s.retainAll(s1);
    Iterator it=s.iterator();
    System.out.println("elements after retain:");
    while(it.hasNext())
    {
     System.out.println(it.next()); 
    }

  }
}