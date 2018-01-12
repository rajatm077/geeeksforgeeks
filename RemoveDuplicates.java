/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toCharArray();
            char[] tot = new char[256];
            for (int i = 0; i < in.length; i++) {
                if (tot[in[i] % 256] == 0) {
                    System.out.print(in[i]);
                    tot[in[i] % 256] = 1;
                }
            }
            System.out.println();
        }
    }
}
