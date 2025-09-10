class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기 계산: start_num에서 end_num까지의 개수
        int size = start_num - end_num + 1;
        int[] answer = new int[size];
        
        // start_num부터 end_num까지 1씩 감소하면서 배열에 저장
        for (int i = 0; i < size; i++) {
            answer[i] = start_num - i;
        }
        
        return answer;
    }
}