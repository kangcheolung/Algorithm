import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works) {
            maxHeap.offer(work);
        }

        for (int i = 0; i < n; i++) {
            int max = maxHeap.poll();
            if (max == 0) break;
            maxHeap.offer(max - 1);
        }

        long answer = 0;
        for (int work : maxHeap) {
            answer += (long) work * work;
        }

        return answer;
    }
}