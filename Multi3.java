

class Multi3
{
    public static void main(String Arg[])
    {
        Thread t =Thread.currentThread();
        System.out.println("name of current thread is "+t.getName());
        System.out.println("name of current thread is "+t.getPriority());
    }
}