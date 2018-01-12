/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split("\\.");
            for (int i = in.length - 1; i >= 0 ; i--) {
                if (i == 0) System.out.print(in[i]);
                else System.out.print(in[i]+".");
            }
            System.out.println();
        }
    }
}
