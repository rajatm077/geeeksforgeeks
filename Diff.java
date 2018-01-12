/**
 * Created by MalhotR1 on 04/18/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Diff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[N][N];
            String[] in = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(in[i*N + j]);
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

            int diag1 = 0;
            int diag2 = 0;
            for (int i = 0; i < N; i++) {
                diag1 += arr[i][i];
                diag2 += arr[i][N-1-i];
            }
            System.out.println(Math.abs(diag1 - diag2));

        }
    }
}
