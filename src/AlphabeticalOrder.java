import java.util.Scanner;


public class AlphabeticalOrder 
{
    
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        
        int age;
        String name;
        
         System.out.println("What is your surname,sorry I keep forgetting");
         name=input.next();
         
         System.out.println("ZZZZZ".compareTo(name));
         age=("ZZZZZ".compareTo(name));
         
         if(age<0)
            {
                System.out.println("You don't have to wait");
            }
         else if(age==1||age==9)
         {
             System.out.println("that's not bad");
         }
         
          else if(age==10 && age==20)
         {
             System.out.println("looks like a bit of a wait");
         }
         
          else if(age==21 && age==30)
         {
             System.out.println("Its gonna be a while");
         }
          else if(age>30)
          {
              System.out.println("not going anywhere for a while");
          }
    }
    
}
