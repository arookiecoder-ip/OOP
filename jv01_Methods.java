class Computer 
{
    public void playMusic() // behaviour
    {
        System.out.println("music playing.. ");
    }


    public String getPen(int cost){
        if (cost >=10) {
            return "pen";
        }
        else
            return "Nothing";  
    }
}


public class jv01_Methods
{
    public static void main(String a[] ) {
        
        Computer com = new Computer();
        com.playMusic();
        String str = com.getPen(2);
        System.out.println(str);
    }
}