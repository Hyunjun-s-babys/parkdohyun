package helloworld;

import java.util.*;

class Solution {
    public int solution(String[] words, String word) {
    	int count = 0;
    	for(int i=0;i<words.length;i++) {
    		for(int j=0;j<word.length();j++) {
    			if(word.charAt(j)!=words[i].charAt(j)) {
    				count++;
    			}
    		}
    	}
        
        return count;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
        String word = new String("CODE");
        int ret = sol.solution(words, word);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
