
/**
 * QuestonFour
 */
import java.util.*;
import java.lang.*;

public class QuestonFour {

    public static boolean isMagic(int n) {
        int sumAll = 0;
        while (n > 0 || sumAll > 9) {
            if (n == 0) {
                n = sumAll;
                sumAll = 0;
            }
            sumAll += n % 10;
            n /= 10;
        }
        return (sumAll == 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = sc.nextInt();
        if (isMagic(N))
            System.out.println("Magic Number");
        else
            System.out.println("Not a magic Number");
    }
}