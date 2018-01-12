/**
 * Created by MalhotR1 on 05/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Unique {
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


            for (int i = 0; i < arr.length - 1; i+= 2) {
                if ((arr[i] ^ arr[i+1]) != 0) {
                    if (i == 0) {
                        System.out.println(arr[i]);
                        break;
                    } else if (i == arr.length - 2) {
                        System.out.println(arr[arr.length - 1]);
                        break;
                    } else {
                        if ((arr[i-1] ^ arr[i]) != 0) {
                            System.out.println(arr[i]);
                            break;
                        } else {
                            System.out.println(arr[i+1]);
                            break;
                        }
                    }
                }
            }
        }
    }
}
