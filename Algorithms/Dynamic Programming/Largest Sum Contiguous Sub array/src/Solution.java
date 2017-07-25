import java.util.Scanner;

public class Solution {
 public int findSum(int [] A,int N){
     int max_so_far=0;
     int max_ending_here=0;
     for(int i=0;i<N;i++){
         max_ending_here=max_ending_here+A[i];
         System.out.println("after adding maximum ending here is:->"+max_ending_here);
         if(max_ending_here<0){
             max_ending_here=0;
         }
         System.out.println("after setting to 0 maximum ending here is:->"+max_ending_here);
         if(max_so_far<max_ending_here){
             max_so_far=max_ending_here;
         }
         System.out.println(" maximum so far is:->"+max_ending_here);
     }
     return max_so_far;
 }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] ga=new int[N];
        for(int i=0;i<N;i++){
            ga[i]=sc.nextInt();
        }
       Solution sl=new Solution();
        System.out.println("maximum Sum for a sub array is:->"+sl.findSum(ga,ga.length));
    }
}
