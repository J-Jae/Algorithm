package com.example.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public int solution(int[] A) {
		int ans = 1;

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				set.add(A[i]);
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (set.contains(ans)) {
				ans++;
			}
		}
		return ans;
	}

}
