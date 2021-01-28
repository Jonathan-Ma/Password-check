import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password{
    public static final int pw_Length = 8;
    public static void main(String[] args) {
        String password;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Please enter a password with least 8 characters and must contain at least two digits and one special symbol(!#$%&-_)");
            System.out.print(">>> ");
            password = keyboard.nextLine();
            if(password.length() <= pw_Length){
                System.out.println("Must be at least 8 characters");
            }
            else if(pwValidator(password)){
                System.out.println("Password is valid");
            }
            else{
                System.out.println("Password incorrect, try another one");
            }
        } while(pwValidator(password) == false);
    }
    //a validator method 
    public static boolean pwValidator(String password) {
        Pattern pattern;
        Matcher matcher;
        //requirements for password
        String validPassword = "^((?=.*[0-9].*[0-9])(?=.*[a-zA-Z])(?=.*[!#$%&-_])).{8,20}.*$";
        pattern = Pattern.compile(validPassword);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
 
