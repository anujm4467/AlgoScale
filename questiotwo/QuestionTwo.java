
/**
 * QuestionTwo
 */
import java.util.*;
import java.lang.*;

public class QuestionTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = " anuj mishra";
        reverseWordInMyString(str);
    }

    public static void reverseWordInMyString(String str) {
        String[] words = str.split(" "); // spleating the word by space
        String reversedString = "";
        for (int i = 0; i < words.length; i++) { // reversing each word
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str); // actual string
        System.out.println(reversedString); // reverse string
    }
}