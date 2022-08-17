//задача про рулет
import java.util.Scanner;

public class Contest_2 {

    int Contest_2(int N) {
        if(1 <= N & N <= 2 * Math.pow(10, 9)) {
            if (N <= 1) {
                return 0;
            } else if (N % 2 == 0) {
                return 1 + Contest_2(N / 2);
            } else {
                return 1 + Contest_2(N - 1);
            }
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Contest_2 ct2 = new Contest_2();
        System.out.println(ct2.Contest_2(N));
    }
}
