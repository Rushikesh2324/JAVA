


class Generic2
{
    public static <T> void Display(Integer Arr[])
    {
        for (T no : Arr)
        {
            System.out.println(no);
        }

    }
    public static void main(String Arg[])
    {
        
       
        Integer A[]={10,20,30,40};
        float B[]={50.89f,60.90f,70.88f};
        Double C[]={50.45,60.44,70.56};

        Display(A);
        Display(B);
        Display(C);

    }

}
      
