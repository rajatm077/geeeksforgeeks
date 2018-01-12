/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int count = 0;
            for (int i = 1; i <= N; i++) {
                count += checkDigit(i);
            }
            System.out.println(count);
        }
    }

    private static int checkDigit(int n) {
        while (n > 0) {
            int rem = n % 10;
            if (rem != 1 && rem != 2 && rem != 3 && rem != 4 &&
                    rem != 5) return 0;
            n = n / 10;
        }
        return 1;
    }
}
