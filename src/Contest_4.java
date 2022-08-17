//задача про бумажку с числами
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contest_4 {

    Contest_4() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Integer[] numbers = new Integer[n];
        int sum = 0;

        for(int i = 0; i < n; i ++) {
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        //System.out.println("Перед заменой: " + Arrays.toString(numbers));

        String[] numbersStr = new String[n];
        for(int i = 0; i < n; i ++) {
            numbersStr[i] = numbers[i].toString();
        }

        ArrayList<Integer> gain = new ArrayList<>();
        int kef = 1;
        for(int i = 0; i < n; i ++) {
            int l = 0;
            for(int j = 0; j < 1; j++) {
                //для старшего разряда
                Integer[] buff = new Integer[numbersStr[i].length()];
                buff[j] = (int) Math.pow(10, numbersStr[i].length() - kef);
                gain.add(buff[j] * (9 - numbers[i] / buff[j]));

                for(int z = 1; z < numbersStr[i].length(); z ++) {
                    //для остальных
                    buff[z] = (int) Math.pow(10, numbersStr[i].length() - kef - z);
                    int value = buff[j] / (int) Math.pow(10, l);
                    gain.add(buff[z] * (9 - ((numbers[i] % value) / buff[z])));
                    l++;
                }
            }
        }
        //преимущества
        //System.out.println(gain);

        int gainRes = 0;
        int buff;
        Collections.sort(gain);
        Collections.reverse(gain);
        if(k <= gain.size()) {
            for (int i = 0; i < k; i++) {
                buff = gain.get(i);
                gainRes += buff;
            }
        }
        else {
            k = gain.size();
            for (int i = 0; i < k; i++) {
                buff = gain.get(i);
                gainRes += buff;
            }
        }
        System.out.println(gainRes);
    }

    public static void main(String[] args) {
        Contest_4 ct4 = new Contest_4();
    }
}
