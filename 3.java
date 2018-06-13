import java.util.*;
import java.lang.*;
 class DisplayOverloading
{
    public void print()
    {
         System.out.println("NULL ARGUMENTS");
    }
    public void print(int num)  
    {
         System.out.println(num+" as an argument(integer).");
    }
public void print(float num)  
    {
         System.out.println(num+" as an argument(float).");
    }
}
class Demo
{
   public static void main(String a[])
   {
       DisplayOverloading ob= new DisplayOverloading();
       ob.print();
       ob.print(10);
       ob.print(50.6f);
   }
}