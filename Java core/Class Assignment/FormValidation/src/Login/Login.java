package Login;

import java.util.Scanner;


public class Login {

    static String userName = "Admin";
    static String password = "12345";

    void validateUserName(String enteredUserName) throws InvalidUsernameException {
        if (!userName.equals(enteredUserName)) {
            throw new InvalidUsernameException();
        }
    }

    void validatePassword(String enteredPassword) throws InvalidPasswordException {
        if (!password.equals(enteredPassword)) {
            throw new InvalidPasswordException();
        }
    }
}

class TestLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        try {
            login.validateUserName(user);
        }
        catch (InvalidUsernameException e) {
            System.out.println(e);
            return;
        }

        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            try {
                login.validatePassword(pass);
                System.out.println("Login Successful!");
                return;

            }
            catch (InvalidPasswordException e) {
                attempts--;
                System.out.println(e.getMessage());

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                } else {
                    System.out.println("Account Locked!");
                }
            }
        }
    }
}
