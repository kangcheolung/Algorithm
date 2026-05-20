import java.util.*;

class Solution {
	 List<String> dict = new ArrayList<>();
	 String[] vowels = {"A", "E", "I", "O", "U"};

	public int solution(String word) {
		dfs("");
		return dict.indexOf(word) + 1;
	}
	void dfs(String cur){
		if(cur.length() > 0) dict.add(cur);
		if(cur.length() == 5) return;
		
		for (String v:vowels){
			dfs(cur+v);
		}
	}
}