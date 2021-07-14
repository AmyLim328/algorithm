package baekjoon1157;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String word = sc.next().toUpperCase();
		int[] alphabet = new int[26];
		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 'A']++;
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
