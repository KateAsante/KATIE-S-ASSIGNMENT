import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Give me a word ");
        keyboard.next();
        
        System.out.print("Give me a second word ");
        keyboard.next();
        
        System.out.print("Now your favorite number ");
        keyboard.next();
        
        System.out.print("Your second-favorite number ");
        keyboard.next();
    }
            
}