 class Computer
{
public void palyMusic()
{
    System.out.println("i will paly music");
}

public String getMypen(int cost)
{
if (cost>=10)

    return "pen";
else
    return "pen is not coming for below 10 rupes";
}



}




public class Methods

{

    public static void main(String[] args) throws Exception {
     Computer cum = new Computer();
     cum.palyMusic();  
      String str=cum.getMypen(15) ;
      System.out.println(str);

}
}