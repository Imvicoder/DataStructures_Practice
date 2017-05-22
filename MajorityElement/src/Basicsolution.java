import java.util.Scanner;

/**
 * Created by Descent-Vikas on 22-05-2017.
 */
public class Basicsolution {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ga[] = new int[N];
        for (int i = 0; i < N; i++) {
            ga[i] = sc.nextInt();
        }
        int count = 0;
        int flag=0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (ga[i] == ga[j]) {
                    count++;
                }
            }
            if (count >= N / 2) {
                flag=1;
                System.out.println("Major element are:->" + ga[i] + " and it is occuring " + count + " times");
            }
            count = 0;
        }
        if(flag==0){
            System.out.println("None");
        }

    }

}

