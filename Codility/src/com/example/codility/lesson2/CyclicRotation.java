package com.example.codility.lesson2;

public class CyclicRotation {
	public int solution(int[] A) {
		int ans = 0;
		for (int num : A) {
			ans = ans ^ num;
		}
		return ans;
	}
}
