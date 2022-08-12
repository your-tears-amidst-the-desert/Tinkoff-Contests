import java.util.ArrayList;
import java.util.Scanner;

public class Contest_6 {

    public String swap(Integer[] height) {
        int even = -1;
        int uneven = -1;
        int count = 0;
        ArrayList<Integer> check = new ArrayList<>();

        for(int i = 0; i < height.length; i++) {
            if(height[i] % 2 == 0) {
                count++;
            }
            if((i+1) % 2 != 0) {
                if(height[i] % 2 == 0) {
                    uneven = i + 1;
                    check.add(uneven);
                }
            }
            else if(height[i] % 2 != 0) {
                even = i + 1;
                check.add(even);
            }
        }

        if( even == -1 || uneven == -1 ) { // || count != height.length() / 2
            return -1 + " " + -1;
        }
        else if(check.size() > 2) {
            return -1 + " " + -1;
        }
        else {
            return uneven + " " + even;
        }
    }

    Contest_6() {
        Scanner scan = new Scanner(System.in);
        //int n = 2 + (int) (Math.random() * 1000);
        int n = scan.nextInt();
        Integer[] height = new Integer[n];

        for (int i = 0; i < n; i++) {
            //height[i] = 1 + (int) (Math.random() * Math.pow(10, (int) (Math.random() * 9)));
            height[i] = scan.nextInt();
        }
        //System.out.println(n + "\n" + Arrays.toString(height));

        System.out.println(swap(height));
    }

    public static void main(String[] args) {
        Contest_6 ct6 = new Contest_6();
    }
}
