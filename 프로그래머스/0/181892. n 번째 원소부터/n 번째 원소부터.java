class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 원소부터 마지막까지의 길이 계산 (1-based이므로 n-1부터 시작)
        int length = num_list.length - (n - 1);
        
        // 결과 배열 생성
        int[] answer = new int[length];
        
        // n번째 원소부터 마지막까지 복사 (n-1 인덱스부터 시작)
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        
        return answer;
    }
}