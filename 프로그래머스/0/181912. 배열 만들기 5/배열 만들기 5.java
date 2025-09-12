import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(String str: intStrs){
            String substring = str.substring(s,s+l);
            int num = Integer.parseInt(substring);
            
            if(num>k){
            result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}