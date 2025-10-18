package ClassWork;

public class Q3 {
    public static void main(String[] args) {
        String str = "Hello World! This is a test... Let's remove punctuation?";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if ((ascii >= 65 && ascii <= 90)
                    || (ascii >= 97 && ascii <= 122)
                    || (ascii >= 48 && ascii <= 57)
                    || ascii == 32) {
                result.append(ch);
            }
        }

        System.out.println("Original --> " + str);
        System.out.println("Without Punctuation  --> " + result.toString());
    }
}

