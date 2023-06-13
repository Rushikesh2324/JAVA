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
    public void fun()
    {
        System.out.println("Inside Base Fun");

    }


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
    public void gun()
    {
        System.out.println("InsideDErived  gun");
        this.Z=111;

    }



}
class DerivedX extends Base
{
    public int Z;

    public DerivedX()
    {
        System.out.println("Inside DerivedX Constructor ");
    }
}

class Hirarchal
{
 
    public static void main(String Arg[])
    {
        //  Base dobj=new Base();                     //no casting == base class refering to base class
       
        DerivedX dobj = new DerivedX();      //no casting == base class refering to base class

        dobj.fun();
        

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.Z);




    }

       

    



}
      

      //   Derived dobj2 = new Derived();
        //  Base dobj2=new Derived();                  //up casting ==base class refering to derived class
        //  Derived dobj=new Base;                     //Down casting===derived class refering to Base class So it is not Allowed 
   