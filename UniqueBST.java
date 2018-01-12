/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UniqueBST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] numerator = new int[N-1];
            int[] denominator = new int[N];
            for (int i = 0; i < denominator.length; i++) {
                denominator[i] = i+1;
            }
            for (int i = 0; i < N - 1; i++) {
                numerator[i] = i + N + 2;
            }
            for (int i = 2; i <=  N; i++) {
                for (int j = 0; j < numerator.length; j++) {
                    if (numerator[j] % i == 0) {
                        numerator[j] = numerator[j] / i;
                        denominator[i-1] = 1;
                        break;
                    }
                }
            }
            long sum = 1;
            for (int i = 0; i < numerator.length; i++) {
                sum *= numerator[i];
            }
            long sum2 = 1;
            for (int i = 0; i < denominator.length; i++) {
                sum2 *= denominator[i];
            }
            System.out.println(sum / sum2);
        }
    }
}
