import java.util.Scanner;

public class Contest_3 {

    Contest_3() {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int all = scan.nextInt();
        int time = scan.nextInt();
        int[] grounds = new int[all];

        for (int i = 0; i < all; i++) {
            grounds[i] = scan.nextInt();
        }

        int number = scan.nextInt();

        if(grounds[number - 1] < time) {
            result += grounds[all - 1] - grounds[0];
        }
        else {
            if(grounds[number - 1] - grounds[0] < grounds[all - 1] - grounds[number - 1]) {
                result += grounds[number - 1] - 2 * grounds[0] + grounds[all - 1];
            }
            else {
                result += 2 * grounds[all - 1] - grounds[number - 1]  - grounds[0];
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Contest_3 ct3 = new Contest_3();
    }
}
