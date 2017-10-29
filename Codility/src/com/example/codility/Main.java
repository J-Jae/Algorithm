package com.example.codility;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();

			List<Integer> baejjang = new LinkedList<>();
			int index;

			if (d == 1) {
				for (int i = 1; i <= n; i++) {
					baejjang.add(i);
				}
				index = 1;
			} else {
				for (int i = n; i >= 1; i--) {
					baejjang.add(i);
				}
				index = 0;
			}

			while (baejjang.size() != 1) {
				index = (index + k - 1) % baejjang.size();
				baejjang.remove(index);
				k += j;
			}

			System.out.println(baejjang.get(0));
		}
	}
}
