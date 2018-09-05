interface Animals{
void speak();
void eat();
}
class cat implements Animals{
public void speak()
{
System.out.println("cat sound");
}
public void eat()
{
System.out.println("cat eats");
}
class dog implements Animals{
public void speak(){
System.out.println("dog sound");
}
public void eat(){
System.out.println("dog eats");
}
}
public class interface1{
public static void main(String args[]){
cat obj = new cat();
obj.speak();
obj.eat();
dog obj1 = new dog();
obj1.speak();
obj1.eat();
}
}


