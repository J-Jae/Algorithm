package com.example.codility.lesson1;

public class BinaryGap {
	public int solution(int N) {
		int ans = 0;
		int binary;
		int cnt = 0;
		boolean isGap = false;

		while (N > 0) {
			binary = N % 2;
			if (binary == 0 && isGap == true) {
				cnt++;
			} else if (binary == 1 && isGap == false) {
				isGap = true;
			} else if (binary == 1 && isGap == true) {
				if (cnt > ans) {
					ans = cnt;
				}
				cnt = 0;
			}
			N = N / 2;
		}
		return ans;
	}
}
