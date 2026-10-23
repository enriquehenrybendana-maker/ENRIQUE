public class NestedLoginValidator {
    public static void main(String[] args) {
        String correctUsername = "henry";
        String correctPassword = "12345";

        String username = "henry";
        String password = "12345";
        boolean accountLocked = false;

        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                if (!accountLocked) {
                    System.out.println("LOGIN SUCCESS");
                } else {
                    System.out.println("LOGIN FAILED: Account is locked.");
                }
            } else {
                System.out.println("LOGIN FAILED: Incorrect password.");
            }
        } else {
            System.out.println("LOGIN FAILED: Incorrect username.");
        }

        username = "wrong";
        password = "12345";

        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                if (!accountLocked) {
                    System.out.println("LOGIN SUCCESS");
                } else {
                    System.out.println("LOGIN FAILED: Account is locked.");
                }
            } else {
                System.out.println("LOGIN FAILED: Incorrect password.");
            }
        } else {
            System.out.println("LOGIN FAILED: Incorrect username.");
        }
    }
}