import java.util.*;
class Base
{
    public int A;
    public int B;

    public Base()
    {
        System.out.println("Inside Base constructor");
        this.A=11;
        this.B=21;
        
    }
    public Void fun()
    {
        System.out.println("Inside Base Fun");

    };


}

class Derived extends Base
{
    public int X;
    public int Y;
    public Derived()
    {
        System.out.println("Inside Derived  constructor");
        this.X=51;
        this.Y=101;
        
    }
    public Void gun()
    {
        System.out.println("InsideDErived  gun");

    }



}

class Single
{
 
    public static void main(String Arg[])
    {
        //  Base dobj=new Base();                     //no casting == base class refering to base class
       
        Derived dobj = new Derived();      //no casting == base class refering to base class

        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);




    }

       

    



}
      

      //   Derived dobj2 = new Derived();
        //  Base dobj2=new Derived();                  //up casting ==base class refering to derived class
        //  Derived dobj=new Base;                     //Down casting===derived class refering to Base class So it is not Allowed 
   