import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Descent-Vikas on 23-07-2017.
 */
public class Solution_Using_Dp {
    public static void main(String...args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String X=br.readLine();
        String Y=br.readLine();
        int m=X.length();
        int n=Y.length();
        int[][] lcs=new int[m+1][n+1];
        //Base Condition
        for(int i=0;i<=m;i++){
            lcs[i][0]=0;
        }
        for(int i=0;i<=n;i++){
            lcs[0][i]=0;
        }
        //recursive relation
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    lcs[i][j]=1+lcs[i-1][j-1];
                }else{
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        System.out.println(lcs[m][n]);
    }
}
