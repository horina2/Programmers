package 레벨1_완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map1 = new HashMap<String, Integer>(); // 참가자 수를 저장할 map1
        
        // key = 이름 / value = 동명이인의 수
        for(int i=0; i<participant.length;i++) {
        	if(map1.containsKey(participant[i])) { // map1에 동명이인이 존재한다면 
        		map1.put(participant[i], map1.get(participant[i])+1); // values + 1
        	}
        	else {
        		map1.put(participant[i], 1);
        	}
        }
        
        for(int i = 0; i<completion.length; i++) {
        	map1.put(completion[i],map1.get(completion[i])-1); // 완주자의 이름이 카운팅 될 때마다, value값을 하나씩 줄인
        }
        
        for(String key : map1.keySet()) {
        	if(map1.get(key) != 0) // key값이 0이 아닌 사람이 탈락자이다.
        		return key;
        }
        
        return answer;
    }
}
