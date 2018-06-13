import java.lang.*;
import java.util.*;
class Staticblock{
    static int i=10;
    static {
        i ++;
        System.out.println("static block called ");
    }
    Staticblock(){
         
        System.out.println("Constructor called");
    }
}
 
class Demo3 {
    public static void main(String a[]) {
       Staticblock t1 = new Staticblock();
       Staticblock t2 = new Staticblock();
   System.out.println(Staticblock.i);
    }
}