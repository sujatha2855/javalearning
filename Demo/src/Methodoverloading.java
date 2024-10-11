public class Methodoverloading {

    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c) 
    {
        return b+c;
    }
    public static void main(String[] args) {
      int r = add(5,6,7);
      System.out.println(r);
    
    
        
    }
}
