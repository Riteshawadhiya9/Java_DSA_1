package projects;

import java.security.SecureRandom;
import java.util.Scanner;

public class random_Password {

    // Define character sets
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Random Password Generator");
        System.out.println("------------------------");

        // Get password length
        System.out.print("Enter password length (8-128): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 128) {
            System.out.println("Invalid length. Using default length of 12.");
            length = 12;
        }

        // Get character set preferences
        System.out.print("Include lowercase letters? (y/n): ");
        boolean useLower = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean useUpper = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include digits? (y/n): ");
        boolean useDigits = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean useSpecial = scanner.next().equalsIgnoreCase("y");

        // Validate at least one character set is selected
        if (!useLower && !useUpper && !useDigits && !useSpecial) {
            System.out.println("At least one character set must be selected. Using all character sets.");
            useLower = useUpper = useDigits = useSpecial = true;
        }

        // Generate and display password
        String password = generatePassword(length, useLower, useUpper, useDigits, useSpecial);
        System.out.println("\nGenerated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean useLower, boolean useUpper,
                                          boolean useDigits, boolean useSpecial) {

        StringBuilder password = new StringBuilder(length);
        StringBuilder charSet = new StringBuilder();

        // Build the character set based on user preferences
        if (useLower) charSet.append(LOWERCASE);
        if (useUpper) charSet.append(UPPERCASE);
        if (useDigits) charSet.append(DIGITS);
        if (useSpecial) charSet.append(SPECIAL);

        String selectedChars = charSet.toString();

        // Ensure at least one character from each selected set is included
        if (useLower) {
            password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        }
        if (useUpper) {
            password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        }
        if (useDigits) {
            password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }
        if (useSpecial) {
            password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));
        }

        // Fill the rest of the password with random characters from all selected sets
        for (int i = password.length(); i < length; i++) {
            password.append(selectedChars.charAt(random.nextInt(selectedChars.length())));
        }

        // Shuffle the characters to mix the mandatory characters
        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
}