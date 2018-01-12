/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ShortestDirection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toUpperCase().toCharArray();
            Arrays.sort(in);
            int count_e = 0;
            int count_n = 0;
            int count_s = 0;
            int count_w = 0;
            for (int i = 0; i < in.length; i++) {
                switch (in[i]) {
                    case 'E' :
                        count_e++;
                        break;
                    case 'N':
                        count_n++;
                        break;
                    case 'S':
                        count_s++;
                        break;
                    case 'W':
                        count_w++;
                        break;
                }
            }

            if (count_e > count_w) {
                for (int i = 0; i < count_e - count_w; i++) {
                    System.out.print('E');
                }
            }
            if (count_n > count_s) {
                for (int i = 0; i < count_n - count_s; i++) {
                    System.out.print('N');
                }
            } else {
                for (int i = 0; i < count_s - count_n; i++) {
                    System.out.print('S');
                }
            }
            if (count_e < count_w) {
                for (int i = 0; i < count_w - count_e; i++) {
                    System.out.print('W');
                }
            }

            System.out.println();
        }
    }
}
