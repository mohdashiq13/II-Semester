import java.util.Scanner;
class AuthenticationException extends Exception{
    public AuthenticationException(String error){
        super(error);
    }
}
public class CO4P3 {
    public static void validation(String userName, String password) throws AuthenticationException{
        if (!userName.equals("Admin"))
            throw new AuthenticationException("!!! Wrong Username !!!");
        else if (!password.equals("1234"))
            throw new AuthenticationException("!!! Wrong Password !!!");
        else
            System.out.println("Access Granted !");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;
        try {
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
            validation(username, password);
        }catch (AuthenticationException e){
            System.out.println(e.getMessage());
        }
    }
}
