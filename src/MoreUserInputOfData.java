import java.util.Scanner;

public class MoreUserInputOfData
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String firstname;
        String lastname;
        int grade;
        String login;
        float gpa;
        int id;
        
        System.out.print("Please enter the following information so i can sell it for profit! ");
        keyboard.next();
        
        
        System.out.print("First Name: ");
        firstname = keyboard.next();
        
        System.out.print("Last Name: ");
        lastname = keyboard.next();
        
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        
        System.out.print("Student ID: ");
        id = keyboard.nextInt();
        
        System.out.print("Login: ");
        login = keyboard.next();
        
        System.out.print("GPA: ");
        gpa = keyboard.nextFloat();
        
        System.out.println(" Your information:                    ");
   
        System.out.println(" Login: " + login  );
        System.out.println(" ID: " + id  ) ;
        System.out.println("Name: " + lastname +  firstname  );
        System.out.println("GPA: " + gpa  );
        System.out.println("Grade: " + grade  );
        
        
               
        
    }
            
    
}
