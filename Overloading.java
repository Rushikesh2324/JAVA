
class Demo
{
    public int Addition (int a, int b)
    {
        return a+b;
    }
    public int Addition (int a, int b,int C)
    {
        return a+b+C;
    }
    public double Addition (int a, int b, int C)
    {
        return a+b+C;
    }
    public double Addition (double a, double b,double C)
    {
        return a+b+C;
    }
}

class Overloading
{
 
    public static void main(String Arg[])
    {
       
        Demo obj=new Demo();
        int A=10,B=20,C=30,iRet=0;
        double X=10.8,Y=90.7,Z=70.9,dRet=0.0;

        iRet=obj.Addition(A,B);
        iRet=obj.Addition(A,B,C);
        dRet=obj.Addition(X,Y,);
        dRet=obj.Addition(X,Y,Z);



    }

       

    



}
      
