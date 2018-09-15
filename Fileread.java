import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class File_read{
public static void main(String args[])
{
File f = new File("D:/java/a.txt");
File a=new File("D:java/m.txt ");
try{
FileInputStream file = new FileInputStream(f);
int r=fin.read();
FileOutputStream fout = new FileOutputStream(a);
while(r!=-1){
fout.write((char)r);
r=fin.read();
}
fin = new FileInputStream(a);
r=fin.read();
while(r!=-1){
System.out.println((char)r);
r=fin.read();
}
}
catch(IOException e){
System.out.println(e);
}
}
}