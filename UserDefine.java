import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}



class UserDefine
{
    public static void main(String Arg[])
    {
        int Age=0;
        Scanner sobj = new Scanner(System.in);

        System.Out.println("Enter your age");
        Age = sobj.nextInt();
        if (Age < 18 )
        {
            throw (new AgeInvalid("Age is less than 18"));
        }
    }
    catch(AgeInvalid obj)
    {
        System.Out.println(obj);
    }


    
}