/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaximumOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in1 = br.readLine().trim().split(" ");
            String[] in = br.readLine().trim().split(" ");
            int M = Integer.parseInt(in1[0]);
            int N = Integer.parseInt(in1[1]);
            int[][] arr = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(in[j + i*N]);
                }
            }


            boolean found = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[j][i] == 1) {
                        System.out.println(j);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }
    }
}
