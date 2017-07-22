import java.util.Scanner;

/**
 * Created by Descent-Vikas on 22-07-2017.
 */
public class Solution_Using_Recursion {

    public int findBinomialCoefficient(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else
            return findBinomialCoefficient(n - 1, r - 1) + findBinomialCoefficient(n - 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Solution_Using_Recursion sr=new Solution_Using_Recursion();
        System.out.println(n+"C"+r+" is:->"+sr.findBinomialCoefficient(n,r));
    }

}

