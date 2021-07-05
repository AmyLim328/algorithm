package baekjoon1157;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String word = sc.next().toUpperCase(); // �빮�� ���
		int[] alphabet = new int[26]; // A ~ Z

		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 'A']++;
			// int[] alphabet = {0, 0, 0, 0, 0 .......};
			// A�� �ε��� 0�� �� ���� B�� �ε��� 1�� �� ���� C�� �ε��� 2�� �� ����
		}

		int max = 0;
		int idx = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				idx = i;
			}
		}
		char res = (char) (idx + 'A');

		for (int i = 0; i < alphabet.length; i++) {
			if (max == alphabet[i] && idx != i) {
				res = '?';
			}
		}
		System.out.println(res);
	}
}