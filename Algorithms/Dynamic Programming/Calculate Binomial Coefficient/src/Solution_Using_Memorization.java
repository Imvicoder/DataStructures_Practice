import java.util.Scanner;

/**
 * Created by Descent-Vikas on 22-07-2017.
 */
public class Solution_Using_Memorization {
  /*  public int findCoeffiecient(int n,int r){
        int memo[][]=new int[n+1][r+1];
        for(int i=0;i<=n;i++){
            for (int j=0;j<=Math.min(i,r);j++){
                if(j==0 || i==j){
                    memo[i][j]=1;
                }else{
                    memo[i][j]=memo[i-1][j-1]+memo[i-1][j];
                }
            }
        }
        return memo[n][r];
    }*/
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Solution_Using_Memorization cb=new Solution_Using_Memorization();
        int n = sc.nextInt();
        int r = sc.nextInt();
        long[][] memo = new long[n+1][r+1];

        // base cases
        for (int i = 0; i <= n; i++) {
            memo[i][0] = 1;
        }

        for (int j = 1; j <= r; j++) {
            memo[0][j] = 0;
        }

        // bottom-up dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= r; j++) {
                memo[i][j] = memo[i-1][j-1] + memo[i-1][j];
            }
        }

        System.out.println("Binomial Coefficient is:->"+memo[n][r]);
    }
}