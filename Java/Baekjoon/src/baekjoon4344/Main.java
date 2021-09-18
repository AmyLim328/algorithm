package baekjoon4344;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			int sum = 0;
			int cnt = 0;

			int n = sc.nextInt();
			int[] score = new int[n];

			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
			}
			for (int k = 0; k < n; k++) {
				sum += score[k];
			}
			double avg = (double) sum / n;

			for (int l = 0; l < n; l++) {
				if (score[l] > avg) {
					cnt++;
				}
			}
			double res = (((double) cnt / n) * 100);
			System.out.printf("%.3f%%\n", res);
		}
		
	}
	
}