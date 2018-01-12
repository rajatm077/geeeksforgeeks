/**
 * Created by MalhotR1 on 04/20/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringWithNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toLowerCase().toCharArray();
            int length = 0;
            int number = 0;
            int k = 0;
            for (int i = in.length - 1; i >= 0; i--) {
                if (in[i] >= 97 && in[i] <= 122) break;
                else {
                    number += (int) (in[i] - 48) * Math.pow(10, k);
                    k++;
                }
            }
            if (number == in.length - k) System.out.println(1);
            else System.out.println(0);
        }
    }
}
