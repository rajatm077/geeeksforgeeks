/**
 * Created by MalhotR1 on 05/17/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int start = Integer.parseInt(in[0]);
            int end = Integer.parseInt(in[1]);

            boolean unique = false;
            for (int i = start; i <= end ; i++) {
                unique = checkUnique(i);
                if (unique) System.out.print(i + " ");
                unique = false;
            }
        }
    }

    private static boolean checkUnique(int i) {
        int[] digits = new int[4];
        int j = 0;
        while (i > 0) {
            digits[j] = (i % 10);
            int k = j-1;
            while (k >= 0) {
                if (digits[k] == digits[j]) return false;
                k--;
            }
            i /= 10;
            j++;
        }
        return true;
    }
}
