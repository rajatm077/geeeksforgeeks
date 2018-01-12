/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BitReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int a  = Integer.parseInt(in[0]);
            int b  = Integer.parseInt(in[1]);
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            ArrayList<Integer> one = new ArrayList<>();
            while (max > 0) {
                one.add(max % 2);
                max = max >> 1;
            }
            int[] arr = new int[one.size()];
            int i = 0;

            while (min > 0) {
                arr[i++] = (min % 2);
                min = min >> 1;
            }

            int count = 0;
            for (int j = 0; j < one.size(); j++) {
                count += arr[j] ^ one.get(j);
            }
            System.out.println(count);




        }
    }
}
