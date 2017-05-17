import java.util.Scanner;

/**
 * Created by Descent-Vikas on 17-05-2017.
 */
public class Reverse {
    public int[] set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ga[]=new int[n];
        for(int i=0;i<ga.length;i++){
            ga[i]=sc.nextInt();;
        }
        return ga;
    }
    public int[] reverse(int [] A){
        int j=A.length;
        for(int i=0;i<j;i++){
            int temp=A[i];
            A[i]=A[j-1];
            A[j-1]=temp;
            j--;
        }
        return A;
    }
    public static void main(String...args){
        Reverse r=new Reverse();
        int [] ga=r.set();
        System.out.println("Given array is:->");
        for(int var:ga){
            System.out.print(var+" ");
        }
        int[] ra=r.reverse(ga);
        System.out.println("\nReversed array is:->");
        for(int var:ra){
            System.out.print(var+" ");
        }
    }
}
