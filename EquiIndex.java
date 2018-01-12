/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EquiIndex {
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
            int inedx = findEquilibrium(arr, arr.length);
            System.out.println(inedx);
        }
    }

    private static int findEquilibrium(int[] arr, int length) {

        //add code here.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (temp == (sum - temp - arr[i])) {
                return i;
            } else {
                temp += arr[i];
            }
        }
        return -1;
    }
}
