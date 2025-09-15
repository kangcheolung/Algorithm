import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String before = my_string.substring(0, s);
        String middle = my_string.substring(s, e+1);
        String after = my_string.substring(e+1);
        
        String reverseMiddle = new StringBuilder(middle).reverse().toString();
        
        return before + reverseMiddle + after;
        
        
    }
}