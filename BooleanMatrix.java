/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BooleanMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int M = Integer.parseInt(in[0]);
            int N = Integer.parseInt(in[1]);
            int[][] arr = new int[M][N];
            int[] row = new int[M];
            int[] col = new int[N];
            in = br.readLine().trim().split(" ");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(in[j + i*N]);
                    if (arr[i][j] == 1) {
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }
            for (int i = 0; i < M; i++) {
                if (row[i] == 1)
                    for (int j = 0; j < N; j++)
                        arr[i][j] = 1;
            }

            for (int i = 0; i < N; i++) {
                if (col[i] == 1)
                    for (int j = 0; j < M; j++) {
                        arr[j][i] = 1;
                    }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();

        }
    }
}
