//задача про тари
import java.util.Scanner;

public class Contest_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int difference = 0;
        int result = 0;
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        if(D > B) {
            difference = D - B;
        }

        result += A + difference * C;
        System.out.println(result);
    }
}
