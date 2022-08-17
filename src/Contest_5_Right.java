import java.util.Scanner;

public class Contest_5_Right {

    public Integer getAmount(long x) {
        String xStr = String.valueOf(x);
        int digits = xStr.length();
        boolean flag = true;

        for(int i = 0; i < digits - 1; i++) {
            if( Integer.parseInt(xStr.substring(i+1, i+2)) < Integer.parseInt(xStr.substring(i, i+1)) ) {
                flag = false;
            }
            else if( Integer.parseInt(xStr.substring(i+1, i+2)) > Integer.parseInt(xStr.substring(i, i+1)) ) {
                break;
            }
        }

        if(flag) {
            return (9 * (digits - 1) + Integer.parseInt(xStr.substring(0, 1)));
        }
        else {
            return (9 * (digits - 1) + Integer.parseInt(xStr.substring(0, 1)) - 1);
        }
    }

    Contest_5_Right() {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long r = scan.nextLong();
        System.out.println(getAmount(r) - getAmount(l-1));
    }

    public static void main(String[] args) {
        Contest_5_Right ct5_R = new Contest_5_Right();
    }
}
