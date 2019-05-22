package Polymorphism;

public class Overloading
{
    //return type and name same
    /* difference in either no. of arguments or data type
     of arguments */

   public int sum(int a, int b)
   {
       return a+b;
   }

   public int sum(int a, int b,int c)
   {
       return a+b+c;
   }

   public int sum(int a,int b,int c,int d)
   {
       return a+b+c+d;
   }

    public static void main(String[] args)
    {
        Overloading obj = new Overloading();

        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,3,4));
        System.out.println(obj.sum(2,3,4,5));

    }

}
