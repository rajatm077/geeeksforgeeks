/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RegEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] pattern = br.readLine().trim().toCharArray();
            char[] in = br.readLine().trim().toCharArray();

            boolean matched = true;
            int start_in = 0;
            int start_pattern = 0;
            int end_in = in.length;
            int end_pattern = pattern.length;

            if (pattern[0] == '^') {
                start_pattern = 1;
            } else if (pattern[pattern.length - 1] == '$') {
                end_pattern--;
                start_in = in.length - pattern.length + 1;
            } else {
                start_in = -1;
                matched = false;
                for (int i = 0; i < in.length; i++) {
                    if (in[i]== pattern[0]) {
                        start_in = i;
                        matched = true;
                        break;
                    }
                }

            }
            int i = start_in;
            int j = start_pattern;
            while (i < end_in && j < end_pattern) {
                if (in[i] != pattern[j]) {
                    matched = false;
                    break;
                }
                i++; j++;
            }
            if (matched) System.out.println(1);
            else System.out.println(0);

        }
    }
}
