package Homework10.Task2;

public class Registration {
    public static void loginPassword(String login, String password, String confirmPassword) throws WrongPasswordExeption, WrongLoginExeption {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginExeption("Login is incorrect");
        }
        if (password.length() >= 20 || password.contains(" ")) {
            throw new WrongPasswordExeption("Password is incorrect");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExeption("Password and confirm password do not match");
        }

    }

    public static class WrongLoginExeption extends Exception{
        public WrongLoginExeption(){
            super();
        }
        public WrongLoginExeption(String message){
            super(message);

        }
    }

    public static class WrongPasswordExeption extends Exception{
        public WrongPasswordExeption(){
            super();
        }
        public WrongPasswordExeption(String message){
            super(message);
        }


    }
}
