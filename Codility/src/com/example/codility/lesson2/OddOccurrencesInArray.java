package com.example.codility.lesson2;

public class OddOccurrencesInArray {
	public int[] solution(int[] A, int K) {
		int[] ans = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			ans[(i + K) % A.length] = A[i];
		}

		return ans;
	}
}
