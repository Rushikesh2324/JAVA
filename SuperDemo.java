import java.util.*;
class Base
{
    public int A;
    

    public Base()
    {
        System.out.println("Inside Base Default constructor");
        this.A=11;  
        
    }
    public Base(int i)
    {
        System.out.println("Inside Base Parametrised constructor");
        this.A=i;  
        
    }
    public Void fun()
    {
        System.out.println("Inside Base Fun");
    }

}    

class Derived extends Base
{
    public int X;
    
    public Derived()
    {
        super(11);
        System.out.println("Inside Derived  constructor");
        this.X=51;
       
        
    }
    public Void gun()
    {
        System.out.println("InsideDErived  gun");
        System.out.println("Value of : "+super.A);
        super.fun();
    }

}

class SuperDemo
{
 
    public static void main(String Arg[])
    {
        //  Base dobj=new Base();                     //no casting == base class refering to base class
       
        Derived dobj = new Derived();      //no casting == base class refering to base class

        dobj.gun();

        System.Out.println(dobj.A);
       
        System.Out.println(dobj.X);
       




    }

       

    



}
      
//1. Access data of parent from child 
//2. 