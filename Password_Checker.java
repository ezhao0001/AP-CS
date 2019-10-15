import java.util.Scanner;
public class Password_Checker{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("What is your username?");
        String username = scan.nextLine();
        System.out.println("What is the password?");
        String password = scan.nextLine();
        
        if (username.equals("Mr.Tiger")&&password.equals("student")){
            System.out.println("Greeting, Mr.Tiger.");
        }
        else if (!username.equals("Mr.Tiger") || !password.equals("student")){
            System.out.println("Username or password is incorrect");
        }
        
    
        
    }
}