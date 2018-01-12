/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CheckInorder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            boolean flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]) continue;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(1);
            else System.out.println(0);
        }
    }
}
