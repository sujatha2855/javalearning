import java.util.Scanner;

public class Calculator {

public static int Addition(int a,int b)
{
return a+b;

}
public static int Subtraction(int a,int b)
{
    return a-b;
}
public static int Multiplication(int a,int b)
{
    return a*b;
}
public static int Multiplication(int a,int b,int c)
{
    return a*b*c;
}
public static double Division(int a,int b)
{
    return a/b;

}
public static double Modulus(int a,int c)
{
    return a%c;
    
}
public static double  Power(int a,int b)
{
   return Math.pow(a,b);   
    
}
public static double  SqureRoot(int a)
{
   return Math.sqrt(a); 
    
}
public static double  CubeRoot(int a)
{
   return Math.cbrt(a);    
}
public static double  Factorial(int a)
{
   int result=1;
   for(int i=1;i<=a;i++)
   {
    result=result*i;
   }   
  return result;  
}
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter first number");  
           int a = s1.nextInt(); 
        System.out.print("Enter second number"); 
           int b  = s1.nextInt();
           System.out.print("Enter Third number"); 
           int c  = s1.nextInt();
       System.out.println( Addition(a,b));
       System.out.println(Subtraction(a,b));
       System.out.println(Multiplication(a,b));
       System.out.println(Multiplication(a,b,c));
       System.out.println(Division(a,b));
       System.out.println(Modulus(a, c));
       System.out.println(Power(a,b));
       System.out.println(SqureRoot(a));
       System.out.println(CubeRoot(a));
       System.out.println(Factorial(a));

       

    }
    
}
