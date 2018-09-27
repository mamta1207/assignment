import java.util.*;
class Mapping
{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Nandini",1);
    hm.put("Neha",2);
    hm.put("Mehak",3);
    hm.put("Mamta",4);
    hm.put("Minal",5);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}