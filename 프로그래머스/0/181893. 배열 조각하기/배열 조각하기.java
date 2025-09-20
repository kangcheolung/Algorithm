class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;                    // 시작 인덱스
        int end = arr.length - 1;         // 끝 인덱스
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                // 짝수 인덱스: 뒷부분 제거 -> end를 줄임
                end = start + query[i];
            } else {
                // 홀수 인덱스: 앞부분 제거 -> start를 늘림  
                start = start + query[i];
            }
        }
        
        // start부터 end까지 복사
        int[] result = new int[end - start + 1];
        for(int i = 0; i < result.length; i++) {
            result[i] = arr[start + i];
        }
        
        return result;
    }
}