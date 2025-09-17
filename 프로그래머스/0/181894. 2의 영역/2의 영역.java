import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;  // 첫 번째 2의 인덱스
        int lastIndex = -1;   // 마지막 2의 인덱스
        
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                firstIndex = i;
                break;  
            }
        }
        
        
        if(firstIndex == -1) {
            return new int[]{-1};
        }
        
        
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                lastIndex = i;
                break;  
            }
        }
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=firstIndex; i<=lastIndex; i++){
            list.add(arr[i]);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}