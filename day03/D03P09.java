package com.learning.core.day03;

public class D03P09 {

	public static void formChain(String[] strings) {
		int n = strings.length;
		int[] visited = new int[n];
		int[] next = new int[n];

		for (int i = 0; i < n; i++) {
			next[i] = -1;
			visited[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (strings[i].charAt(strings[i].length() - 1) == strings[j].charAt(0) && visited[j] == 0) {
					next[i] = j;
					visited[j] = 1;
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (next[i] != -1) {
				System.out.println("yes");
				System.out.println(strings[i] + " " + strings[next[i]]);
			} else {
				System.out.println("no");
			}
		}
	}

	public static void main(String[] args) {
		String[] strings = { "abb", "cd", "da" };

		formChain(strings);
	}

}