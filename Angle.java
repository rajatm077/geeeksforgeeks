/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Angle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (float t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            float h = Float.parseFloat(in[0]);
            float m = Float.parseFloat(in[1]);
            float a_m = (6 * m) % 360;
            float a_h = 30 * h + (m * a_m) / 360;
            float greater = Math.max(a_m, a_h);
            float smaller = Math.min(a_m, a_h);
            float angle = greater - smaller;
            float angle2 = 360 - greater + smaller;
            float res = Math.min(angle, angle2);
            int res2 = (int) Math.floor(res);
            System.out.println(res2);

        }
    }
}
