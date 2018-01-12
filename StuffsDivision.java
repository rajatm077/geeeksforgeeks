/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StuffsDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            long total = (N * (N + 1)) / 2;
            long sum = 0;
            for (int i = 0; i < in.length; i++) {
                sum += Long.parseLong(in[i]);
            }
            if (sum == total) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
