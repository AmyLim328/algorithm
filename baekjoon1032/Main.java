package baekjoon1032;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] filename = new String[n];
		for (int i = 0; i < n; i++) {
			filename[i] = sc.next();
		}

		boolean isDifferent;

		for (int i = 0; i < filename[0].length(); i++) {
			isDifferent = false;
			for (int j = 0; j < n - 1; j++) {
				if (filename[j].charAt(i) != filename[j + 1].charAt(i)) {
					isDifferent = true;
					break;
				}
			}
			if (isDifferent)
				System.out.print("?");
			else
				System.out.print(filename[0].charAt(i));
		}

	}
}
