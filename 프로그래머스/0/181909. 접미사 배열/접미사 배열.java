import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> suffixes = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String suffix = my_string.substring(i);
            suffixes.add(suffix);
        }
        Collections.sort(suffixes);
        
        return suffixes.toArray(new String[suffixes.size()]);
    }
}