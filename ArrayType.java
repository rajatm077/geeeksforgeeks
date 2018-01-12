/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayType {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            int max_i = 0;
            int min_i = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    max_i = i;
                }
                if (min > arr[i]) {
                    min = arr[i];
                    min_i = i;
                }
            }
            if (max_i == arr.length - 1){
                if (min_i == 0) System.out.println(max + " 1");
                else System.out.println(max + " 3");
            } else if (max_i == 0){
                if (min_i == arr.length - 1) System.out.println(max + " 2");
                else System.out.println(max + " 4");
            } else if (arr[max_i - 1] < arr[max_i + 1]) {
                System.out.println(max + " 3");
            } else System.out.println(max + " 4");
        }
    }
}
