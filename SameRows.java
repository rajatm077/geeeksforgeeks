/**
 * Created by MalhotR1 on 05/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SameRows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int M = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int N = in[0].length();

            int[][] arr = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(in[j + i*N]);
                }
            }

            char[] rows = new char[M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[j][i] == 1);
                }
            }

        }
    }
}
