/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeypadTyping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toLowerCase().toCharArray();
            for (int i = 0; i < in.length; i++) {
                int n = in[i] - 96;
                if (n <= 15) {
                    if (n%3 == 0) System.out.print((n/3 + 1));
                    else System.out.print((n/3 + 2));
                } else {
                    if (n <= 19) System.out.print(7);
                    else if (n <= 22) System.out.print(8);
                    else System.out.print(9);
                }
            }
            System.out.println();
        }
    }
}
