class Solution {
    public int[] solution(int n, int k) {
        // k의 배수 개수 계산 (n을 k로 나눈 몫)
        int count = n / k;
        
        // 배열 생성
        int[] answer = new int[count];
        
        // k의 배수들을 배열에 저장
        for (int i = 0; i < count; i++) {
            answer[i] = k * (i + 1);
        }
        
        return answer;
    }
}