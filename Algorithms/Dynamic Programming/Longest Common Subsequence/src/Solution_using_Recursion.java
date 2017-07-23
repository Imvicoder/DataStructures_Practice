import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Descent-Vikas on 23-07-2017.
 */
public class Solution_using_Recursion {
    public int findLIS(String str1,String str2,int m,int n){
        if(m==0 || n==0){
            return 0;
        }else if(str1.charAt(m-1)==str2.charAt(n-1)){
            return 1+findLIS(str1,str2,m-1,n-1);
        }else {
            return Math.max(findLIS(str1,str2,m-1,n),findLIS(str1,str2,m,n-1));
        }

    }
    public static void main(String...args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String X=br.readLine();
        String Y=br.readLine();
        int m=X.length();
        int n=Y.length();
        Solution_using_Recursion sr=new Solution_using_Recursion();
        System.out.println("Longest Common Subsequence 's length is:->"+sr.findLIS(X,Y,m,n));
    }
}
