package org.example;

public class SimpleLoop
{
    public static int mystery(int a, int b)
    {
        if (b==0) return 0;
        if (b%2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }// end mystery()

    public static void main(String[] args)
    {
        //callMyself(4);
        System.out.println(mystery(2, 10));
    }//end main

}//end class
