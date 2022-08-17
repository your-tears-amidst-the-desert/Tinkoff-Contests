import java.util.ArrayList;
import java.util.Scanner;

public class Contest_5_Pereborom {

    public boolean haveSameSymbols(long x) {
        String xStr = String.valueOf(x);
        int length = xStr.length();
        String firstEl = xStr.substring(0, 1);

        if(length >= 2) {
            for (int i = 0; i < length; i++) {
                String El = xStr.substring(i, i + 1);
                if (!firstEl.equals(El)) {
                    return false;
                }
            }
        }
        else {
            return x == Long.parseLong(firstEl);
        }
        return true;
    }

    Contest_5_Pereborom() {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long r = scan.nextLong();
        ArrayList<Long> res = new ArrayList<>();

        for(long i = l; i <= r; i++) {
            if(haveSameSymbols(i)) {
                res.add(i);
            }
        }
        System.out.println(res);
        System.out.println(res.size());
    }

    public static void main(String[] args) {
        Contest_5_Pereborom ct5_P = new Contest_5_Pereborom();
    }
}
