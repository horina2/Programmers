package 레벨1_K번째수;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};        
        int[][] new_arr = {};
        
        // commands의 length만큼 돌아야 원하는 크의 배열이 나온다.
        for(int i = 0; i < commands.length; i++) {
        	//commands의 0번째 원소 = 자를 배열의 시작 / 1번째 = 끝 
        	for(int j = commands[i][0]; j<= commands[i][1]; j++) {
        		new_arr[i][j] = array[j];
        	}
        	Arrays.sort(new_arr[i]);
        	answer[i] = new_arr[i][commands[i][2]];
        }
        
        return answer;
    }
	

}
