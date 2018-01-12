/**
 * Created by MalhotR1 on 05/05/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class MinSum {
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
            Arrays.sort(arr);
            boolean addZero = false;
            int length = arr.length - 1;
            if (length % 2 == 0) {
                addZero = true;
            }

            int n1 = 0, n2 = 0;
            int i = 0;
            while (i < arr.length) {
                if (arr[i] == 0) {
                    i++;
                    length--;
                    if (length % 2 == 0) addZero = true;
                    else addZero = false;
                } else if (i == length && addZero) {
                    n1 *= 10;
                } else {
                    n1 = n1*10 + arr[i++];
                    n2 = n2*10 + arr[i++];
                }
            }
            System.out.println(n1 + n2);
        }
    }
}
