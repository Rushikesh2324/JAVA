class Marvallous implements Runnable
{
    public void run()
    {
        Display(;
        synchroinzed)
        for (int i =1;i<1000;i++)
        {
            System.out.println(i);
        }
    }
}

class Multi2
{
    public static void main(String Arg[])
    {
        Marvallous mobj1=new Marvallous();
        Marvallous mobj2=new Marvallous();

        Thread t1=new Thread(mobj1);
        Thread t2=new Thread(mobj2);

        t1.start();
        t2.start();

    }
}