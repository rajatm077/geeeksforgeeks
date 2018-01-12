/**
 * Created by MalhotR1 on 04/18/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OpenDoor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((j+1)%i == 0) arr[j] ^= 1;
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
