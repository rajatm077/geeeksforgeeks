/**
 * Created by MalhotR1 on 05/17/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FakeProfile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toLowerCase().toCharArray();
            int[] arr = new int[26];
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 'a' || in[i] == 'e' || in[i] == 'i' || in[i] == 'o' || in[i] == 'u') continue;
                arr[in[i] - 97]++;
            }

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) count++;
            }
            if (count % 2 == 0) System.out.println("SHE!");
            else System.out.println("HE!");
        }
    }
}
