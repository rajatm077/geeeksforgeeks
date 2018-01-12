/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SetBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int count = 0;
            while (N > 0) {
                if (N % 2 == 1) count++;
                N = N / 2;

                /*Brian Kernighan's algo
                *while (N > 0) {
                *   N = N & (N-1);
                *   count++;
                * }
                * */
            }
            System.out.println(count);
        }
    }
}
