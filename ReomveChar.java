/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReomveChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
           char[] in1 = br.readLine().trim().toCharArray();
           char[] in2 = br.readLine().trim().toCharArray();
            for (int i = 0; i < in1.length; i++) {
                boolean present = false;
                char c = in1[i];
                for (int j = 0; j < in2.length; j++) {
                    if (c == in2[j]) {
                        present = true;
                        break;
                    }
                }
                if (!present) System.out.print(c);
            }
            System.out.println();
        }
    }
}
