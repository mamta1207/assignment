import java.util.Scanner;
abstract class Animals{
String breed;
String colour;
String name;
void speak(){
System.out.println("Animal sound");
}
abstract void eat();
}
public class abstract2 extends Animals{
void eat(){
System.out.println("Animal eats");
}
void get(){
Scanner sc = new Scanner(System.in);
Name = sc.next();
breed = sc.next();
colour = sc.next();
}
void display()
{
System.out.println(Name of animal : "+Name+" \nbreed of animal : "+breed+"\ncolour of animal : "+colour);
}
public static void main(String args[]){
abstract2 obj = new abstract2();
obj.get();
obj.display();
obj.speak();
obj.eat();
}
}

