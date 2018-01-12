/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalPath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int max = Math.max(a,b) - 1;
            int min = Math.min(a,b) - 1;

            int total = max + min;
            int prod = 1;
            int prod2 = 1;
            for (int i = max + 1; i <= total ; i++) {
                prod *= i;
            }
            for (int i = 1; i <= min ; i++) {
                prod2 *= i;
            }

            prod = prod / prod2;
            System.out.println(prod);


        }
    }
}
