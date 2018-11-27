import java.util.*;
import java.lang.*;

class QuestionFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 3 == 0) {
            System.out.println("I Like Coffee");
        } else if (N % 5 == 0) {
            System.out.println("I Like Tea");
        } else if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("I Like both");
        } else {
            System.out.println("Pleade Enter Integer Number 3 And 5 Only ");
        }

    }
}