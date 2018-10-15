import java.util.*;
 class Sort1
 {

	public static void main(String[] args) 
     {
     ArrayList<String> s=new ArrayList<String>();
     s.add("nandini");
     s.add("minal");
     s.add("neha");
     Collections.sort(s);
     System.out.println(s);

     ArrayList<Integer> i=new ArrayList<Integer>();

     i.add(1);
     i.add(22);
     i.add(3);
     Collections.sort(i);
     System.out.println(i);
	}

}