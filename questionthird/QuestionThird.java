
/**
 * QuestionThird
 */
import java.util.*;
import java.lang.*;

public class QuestionThird {

    public int binarySearch(int arr[], int l, int r, int x) {
        Arrays.sort(arr);
        if (r >= l) { // base case

            int mid = l + (r - l) / 2; // finding the mid value of array

            if (arr[mid] == x) // checkimg if value present in mid of array
                return mid;

            if (arr[mid] > x) // if value is less then mid
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x); // else we apply on greter side
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        QuestionThird ob = new QuestionThird();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elemnts");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element what you want to search ");
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}