package 레벨2_전화번호_목록;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 전화번호부 정렬 
        Arrays.sort(phone_book);
        
        for(int i=1; i<phone_book.length; i++) {
        	if(phone_book[i].contains(phone_book[i-1])) {
        		answer = false;
        		return answer;
        	}
        }
        
        return answer;
    }
}