public class Encaptulation {

private String  name;

private int age;
public int getAge()
   {
    return age;
}
public void setAge(int a)
{
age=a;

}
public String getName()
{
return name;

}
 public void setName(String n)
 {
     name=n;

 }
 
    public static void main(String[] args) {

        Encaptulation en= new Encaptulation();
        
        en.setName("sujatha");
        en.setAge(31);
    
         System.out.println(en.getName()+" :" +en.getAge());
     }
     

 }

    

           