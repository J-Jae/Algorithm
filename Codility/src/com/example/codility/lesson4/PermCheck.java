package com.example.codility.lesson4;

public class PermCheck {

	public int solution(int[] A) {
		int n = A.length;
		boolean[] check = new boolean[n + 1];

		for (int num : A) {
			if (num > n || check[num] == true) {
				return 0;
			} else {
				check[num] = true;
			}
		}
		return 1;
	}

}
