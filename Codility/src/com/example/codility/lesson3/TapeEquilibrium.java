package com.example.codility.lesson3;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int ans = Integer.MAX_VALUE;
		int frontSum = 0;
		int backSum = 0;
		int difference = 0;
		
		for (int i = 0; i < A.length; i++) {
			backSum += A[i];
		}
		
		for (int i = 0; i < A.length-1; i++) {
			frontSum += A[i];
			backSum -= A[i];
			difference = Math.abs(frontSum - backSum);
			
			if (difference < ans) {
				ans = difference;
			}
		}
		return ans;
	}
}
