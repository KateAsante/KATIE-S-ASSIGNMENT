import java.util.Scanner;
public class AgeInFiveYears
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.print("Hello. What is your name? ");
        name = keyboard.next();
        
        System.out.print("Hi, How old are you? ");
        age = keyboard.nextInt();
        
        System.out.println("Did you know that in five years you wil be " + (age+5) + " years old!");
        
        System.out.println("And in five years ago you were " +(age-5) + "! Imagine that!");
        
        
        
                
                        
    }
}
