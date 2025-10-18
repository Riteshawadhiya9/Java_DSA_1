package projects;

import java.util.Random;

public class random_password_generetor {

    public static void main(String[] args) {
        System.out.println("Password: " + generatePassword(8));
    }

    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String password = "";

        for (int i = 0; i < length; i++) {
            password += chars.charAt(random.nextInt(chars.length()));
        }

        return password;
    }
}