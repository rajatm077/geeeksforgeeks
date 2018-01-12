/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class EasyQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in2 = br.readLine().trim().split(" ");
            String[] in = br.readLine().trim().split(" ");
            String[] query = br.readLine().trim().split(" "); 
            int N = Integer.parseInt(in2[0]);
            int Q = Integer.parseInt(in2[1]);

            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int q = 0;
            while (q < query.length) {
                int X = Integer.parseInt(query[q++]);
                int Y = Integer.parseInt(query[q++]);
                int k = Integer.parseInt(query[q++]);

                int[] new_arr = new int[Y - X + 1];
                int j = 0;
                for (int i = X-1; i < Y && j < new_arr.length; i++, j++) {
                    new_arr[j] = arr[i];
                }
                Arrays.sort(new_arr);
                System.out.print(new_arr[k-1] + " ");
            }
            System.out.println();
        }
    }
}
