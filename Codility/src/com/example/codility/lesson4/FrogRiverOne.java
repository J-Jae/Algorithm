package com.example.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public int solution(int X, int[] A) {
		Set<Integer> leaves = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				leaves.add(A[i]);

				if (leaves.size() == X) {
					return i;
				}
			}
		}
		return -1;
	}
}
