/**
 * Created by MalhotR1 on 05/03/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JesseCookies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);
        in = br.readLine().trim().split(" ");
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in[i]);
            if (arr[i] < K) count++;
        }
        Arrays.sort(arr);
        count--;
        int i = 1;
        int steps = 0;
        while(count-- > 0) {
            arr[i] = 2 * arr[i] + arr[i-1];
            if (arr[i] < K) i++;
            else i += 2;
            steps++;
        }
        System.out.println(steps);
    }
}
