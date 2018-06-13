import java.lang.*;
import java.util.*;
class Animal
{
  String breed,colour;
void get()
{
System.out.println("Enter breed and color: ");
Scanner s1=new Scanner(System.in);
 breed=s1.next();
  colour=s1.next();
}
  void print()
{
System.out.println("breed:"+breed+" \ncolour:"+colour);
 }  
void speak(){
System.out.println("CLASS ANIMAL ");
  }
}
class Dog extends Animal
{
void speak(){
System.out.println("CLASS DOG ");
System.out.println("Dog barks");
  }
}
class Cat extends Animal
{
void speak(){
System.out.println("CLASS CAT ");
System.out.println("Cat makes a sound of meow");
  }
}
class Demo1{
 public static void main(String a[])

  {
   Animal a1=new Animal();
     a1.speak();
             Dog d1=new Dog();
             d1.get();
             d1.speak();
              d1.print();
             Cat c1=new Cat();
             c1.get();
             
             c1.speak();
                c1.print();
  }

}
