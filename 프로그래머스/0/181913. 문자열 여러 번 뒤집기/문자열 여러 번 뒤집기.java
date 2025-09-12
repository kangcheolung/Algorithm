class Solution {
    public String solution(String my_string, int[][] queries) {
        // 문자열을 char 배열로 변환하여 조작하기 쉽게 만듦
        char[] chars = my_string.toCharArray();
        
        // 각 쿼리를 순서대로 처리
        for(int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            // start부터 end까지의 구간을 뒤집기
            reverse(chars, start, end);
        }
        
        // char 배열을 문자열로 변환하여 반환
        return new String(chars);
    }
    
    // 배열의 특정 구간을 뒤집는 헬퍼 메소드
    private void reverse(char[] chars, int start, int end) {
        while(start < end) {
            // start와 end 위치의 문자를 교환
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
    }
}