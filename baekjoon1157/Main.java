package baekjoon1157;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String word = sc.next().toUpperCase(); // 대문자 출력
		int[] alphabet = new int[26]; // A ~ Z

		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 'A']++;
			// int[] alphabet = {0, 0, 0, 0, 0 .......};
			// A면 인덱스 0의 값 증가 B면 인덱스 1의 값 증가 C면 인덱스 2의 값 증가
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