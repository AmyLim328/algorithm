package baekjoon1546;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] score = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
		}

		double newSum = 0;
		for (int i = 0; i < score.length; i++) {
			newSum += (double) score[i] / max * 100;
		}
		double newAvg = newSum / n;
		System.out.println(newAvg);

	}

}