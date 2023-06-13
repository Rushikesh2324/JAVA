

class Cmmandline
{
    public static void main(String Arg[])
    {
 
      
        System.out.println("Demonstration of command line");

        int No1 = Integer.parseInt(arg[0]);
        int No2=Integer.parseInt(arg[1]);

        int Ans =No1+No2;

        System.out.println("Addition is "+Ans);
        System.out.println("Number of commandline arguments "+arg.length);




    }
}