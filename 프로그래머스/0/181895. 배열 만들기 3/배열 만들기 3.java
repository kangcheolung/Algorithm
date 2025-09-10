class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 첫 번째 구간과 두 번째 구간의 정보 추출
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        // 각 구간의 길이 계산
        int firstLength = b1 - a1 + 1;
        int secondLength = b2 - a2 + 1;
        
        // 결과 배열 크기 = 두 구간의 길이 합
        int[] answer = new int[firstLength + secondLength];
        
        // 첫 번째 구간을 결과 배열에 복사
        for (int i = 0; i < firstLength; i++) {
            answer[i] = arr[a1 + i];
        }
        
        // 두 번째 구간을 결과 배열에 복사 (첫 번째 구간 뒤에 이어서)
        for (int i = 0; i < secondLength; i++) {
            answer[firstLength + i] = arr[a2 + i];
        }
        
        return answer;
    }
}