import java.util.*;
public class allSubstring {
public static void main(String args[]) {
String x = "xyz";int y = x.length();int z = 1;
for(int i=0;i<=y-1;i++){
System.out.println(x.substring(i,i+z));
if(i+z!=y) continue;
if(z==y) break;
z++;
i=-1;
}
}
}