package com.example.codility.lesson3;

public class PermMissingElem {

	public int solution(int[] A) {
		long n = A.length + 1;
		long ans = n * (n + 1) / 2;

		for (int num : A) {
			ans -= num;
		}

		return (int)ans;
	}

	public int solution2(int[] A) {
		boolean[] check = new boolean[A.length + 2];
		for (int num : A) {
			check[num] = true;
		}
		for (int i = 1; i <= check.length; i++) {
			if (check[i] == false) {
				return i;
			}
		}
		return 0;
	}
}
