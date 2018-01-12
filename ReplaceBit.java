/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReplaceBit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            char[] arr = Integer.toBinaryString(n).toCharArray();
            if (arr[k-1] == '1') arr[k-1] = '0';

            n = 0;
            int l = 0;
            for (int i = arr.length - 1; i >= 0; i--, l++) {
                n += (arr[i] - 48) * (int) Math.pow(2,l);
            }
            System.out.println(n);
        }

    }
}
