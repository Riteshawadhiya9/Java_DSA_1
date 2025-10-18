package ClassWork;

public class Remove_Punctuation {
    public static void main(String[] args) {
        String str = "Hello World! This is a test... Let's remove punctuation?";
        String output = str.replaceAll("[\\p{P}]","");
        System.out.println("Original --> "+ str);
        System.out.println("Without Punctuationc--> "+ output);
    }
}
