/**
 * Created by MalhotR1 on 05/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PreorderBST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < in.length; i++) {
                if (!in[i].isEmpty()) {
                    arr.add(Integer.parseInt(in[i]));
                }
            }

            int[] preorder = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                preorder[i] = arr.get(i);
            }

            int[] inorder = Arrays.copyOf(preorder, preorder.length);

            Arrays.sort(inorder);
            int index = Arrays.binarySearch(inorder, preorder[0]);
            boolean flag = true;
            for (int i = 1; i < index; i++) {
                if (preorder[i] > preorder[i + 1]) {
                    flag = false;
                    break;
                }
            }
            for (int i = index + 1; i < preorder.length - 1 && flag; i++) {
                if (preorder[i] > preorder[i + 1]) {
                    flag = false;
                }
            }
            if (flag) System.out.println(1);
            else System.out.println(0);

        }
    }
}