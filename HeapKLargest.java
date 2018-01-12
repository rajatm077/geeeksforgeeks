/**
 * Created by MalhotR1 on 05/03/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class HeapKLargest {
    public static void main(String[] args) throws IOException {
        int[] heap = {100,80,90,10,70,1,2};
        int heapHeight = (int) (Math.log(heap.length) / Math.log(2));
        for (int i = 0; i <= heapHeight; i++) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(0);
            if (i == 0) System.out.println(heap[queue.peek()]);
            else {
                for (int j = 0; j < i; j++) {
                    int n = queue.size();
                    while (n -- > 0) {
                        int index = queue.poll();
                        int left = 2 * index + 1;
                        if (left < heap.length) {
                            queue.add(left);
                            int right = left + 1;
                            if (right < heap.length) {
                                queue.add(right);
                            }
                        }
                    }
                }
                int max = Integer.MIN_VALUE;
                for (Integer integer : queue) {
                    max = Math.max(max, heap[integer]);
                }
                System.out.println(max);
                queue.clear();
            }
        }
    }
}
