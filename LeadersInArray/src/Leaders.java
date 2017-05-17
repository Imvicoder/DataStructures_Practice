import java.util.Scanner;

/**
 * Created by Descent-Vikas on 17-05-2017.
 */
//An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
// For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
public class Leaders {
    public static void main(String... args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ga[] = new int[n];
        for (int i = 0; i < n; i++) {
            ga[i] = sc.nextInt();
        }
        int max = ga[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (ga[i] >= max) {
                max=ga[i];
                System.out.println(max);

            }

        }
    }
}

