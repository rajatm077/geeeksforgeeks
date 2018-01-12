/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            N = (int) Math.pow(10, N) - 1;
            int count = 0;
            for (int i = 1; i <= N; i++) {
                boolean zero = hasZero(i);
                if (zero) count++;
            }
            System.out.println(count);
        }
    }

    private static boolean hasZero(int i) {
        while (i > 0) {
            int rem = i % 10;
            if (rem  == 0) return true;
            i = i / 10;
        }
        return false;
    }
}
