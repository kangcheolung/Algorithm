import java.util.*;
import java.io.*;

class Solution {
	public int solution(int k, int[] tangerine) {
		Arrays.sort(tangerine);

		List<Integer> counts = new ArrayList<>();
		int cnt = 1;
		for(int i=1; i<tangerine.length; i++){
			if(tangerine[i] == tangerine[i-1]){
				cnt++;
			}else{
				counts.add(cnt);
				cnt = 1;
			}
		}
		counts.add(cnt);

		counts.sort((a,b) -> b-a); // 내림차순

		int answer = 0;
		int total = 0;
		for(int count: counts){
			total += count;
			answer++;
			if (total >= k) break;
		}

		return answer;

	}

}