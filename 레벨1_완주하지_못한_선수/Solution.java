package 레벨1_완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map1 = new HashMap<String, Integer>(); // 참가자 수를 저장할 map1
        Map<String, Integer> map2 = new HashMap<String, Integer>(); // 완주자 수를 저장할 map2
        
        for(int i=0; i<participant.length;i++) {
        	if(map1.containsKey(participant[i])) { // map1에 동명이인이 존재한다면 
        		map1.put(participant[i], map1.get(participant[i])+1); // values + 1
        	}
        	else {
        		map1.put(participant[i], 0);
        	}
        }
        
        for(int i=0; i<completion.length;i++){
        	if(map2.containsKey(completion[i])) {  
        		map2.put(completion[i], map2.get(completion[i])+1); 
        	}
        	else {
        		map2.put(completion[i], 0);
        	}
        }
        
        for(String key : map2.keySet()) {
        	// 탈락자가 1명이기 때문에 key와 value가 정확히 일치하지 않는 값이 탈락자이다.  
        	if(map1.containsKey(key) && map1.get(key).equals(map2.get(key))) {
        		map1.remove(key);
        	}
        	else {
        		answer = key;
        		return answer;
        	}
        }
        
        
        
        return answer;
    }
}
