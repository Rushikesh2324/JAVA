

class StringDemo1
{
    public static void main(String Arg[])
    {
 
       String str1="Hello";
       String str2=new String("Hello");
      
       if (str1==str2)
       {
        System.out.println("String are equal");

       }
       else
       {
        System.out.println("String not are equal");
       }
       
       if (str1.equals(str2))
       {
        System.out.println("String are equal");

       }
       else
       {
        System.out.println("String not are equal");
       }
       



    }
}