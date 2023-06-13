
import java.util.*;


class Collection4
{
   
    public static void main(String Arg[])
    {
        
     Hashtable <String , Integer> hobj = new Hashtable<String ,Integer>();

     hobj.put("C programming ",990);
     hobj.put("C++ programming ",1200);
     hobj.put("Java programming ",700);
     hobj.put("Python  programming ",1650);

   

     System.out.println("Book price of java "+hobj.get("Java programming"));
     hobj.remove("C++ Programming ");

     Enumeration eobj - hobj.keys();
     while ((eobj).hasMoreElement())
     {

      System.out.println((eobj).nextElement());
     }
        

    }

}
      
