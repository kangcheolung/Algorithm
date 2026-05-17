class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                sb.append(arr[i].substring(0, 1).toUpperCase());
                sb.append(arr[i].substring(1).toLowerCase());
            }
            if (i < arr.length - 1) sb.append(" "); 
        }
        
        return sb.toString();
    }
}