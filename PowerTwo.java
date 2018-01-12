/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PowerTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            long N = Long.parseLong(br.readLine().trim());
            long res = N & (N-1);
            if (res == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
