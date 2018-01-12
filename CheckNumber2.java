/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class CheckNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int start = Integer.parseInt(in[0]);
            int end = Integer.parseInt(in[1]);
            int count = 0;
            for (int i = start; i <= end ; i++) {
                int temp = i;
                ArrayList<Integer> al = new ArrayList<>();
                while (temp > 0) {
                    al.add(temp % 10);
                    temp = temp / 10;
                }
                if (al.get(0).equals(al.get(al.size() - 1))) count++;


            }
                System.out.println(count);
            }
        }
    }
