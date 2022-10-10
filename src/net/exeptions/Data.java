package net.exeptions;

public class Data {

    public static boolean checkData (String login, String password, String confirmPassword) {
        if (login.matches("^[0-9a-zA-Z_]{1,20}$")) {
            if (password.matches("^[0-9a-zA-Z_]{1,20}$") && password.equals(confirmPassword)) {
                return true;
            } else {
                throw new WrongPasswordException();
            }
        } else {
            throw new WrongLoginException("Логин задан в неверном формате");
        }
    }
}
