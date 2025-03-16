package 레벨1_폰켓몬;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static int solution(int[] nums) {
		int answer = 0;

		Set<Integer> set1 = new HashSet<>();
		
		for(int i=0;i<nums.length;i++)
			set1.add(nums[i]);
		// 중복 값을 제거하기 위해 집합 생성
		
		answer = Math.min(set1.size(), nums.length/2);
		// 가져갈 수 있는 포켓몬의 수는 둘 중 더 작은 값 
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		for(int i = 0; i<n; i++) {
			nums[i] = scanner.nextInt();
		}

		System.out.println(solution(nums)); 
		scanner.close();
	}
}
