
import java.util.Scanner;

/**
 * Created by Descent-Vikas on 17-05-2017.
 */
public class Solution {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int given_sum = sc.nextInt();
        int[] ga = new int[n];
        for (int i = 0; i < ga.length; i++) {
            ga[i] = sc.nextInt();
        }
        boolean temp[] = new boolean[10000000];
        for (int i = 0; i < n; i++) {
            int other = given_sum - ga[i];
            System.out.println("other is:->" + other + " and ga[" + i + "] is:-> " + ga[i]);
            if (other >= 0 && temp[ga[i]]) {
                System.out.println("pairs with given sum " + given_sum + " are:-> " + other + "," + ga[i]);
            }
            temp[other] = true;
           /* if (other >= 0 && temp[other]) {
                System.out.println("pairs with given sum " + given_sum + " are:-> " + other + "," + ga[i]);
            }
            temp[ga[i]] = true;*/
        }
    }
}
