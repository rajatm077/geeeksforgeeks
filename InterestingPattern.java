/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InterestingPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < 2*N - 1; i++) {
            System.out.print(N);
            if (i <= N) {
                for (int j = 0; j < 2*N-3; j++) {
                    System.out.print(N-i);
                }
            }
            System.out.println(N);
        }
    }
}
