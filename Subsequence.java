/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            char[] a = in[0].toLowerCase().toCharArray(); //small
            char[] b = in[1].toLowerCase().toCharArray(); //large

            boolean passed = true;
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                boolean found = false;
                for (; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(0);
                    passed = false;
                    break;
                }
            }
            if (passed) System.out.println(1);
        }
    }
}
