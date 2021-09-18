package baekjoon1920;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arrN = new int[n];
		for (int i = 0; i < n; i++) {
			arrN[i] = sc.nextInt();
		}
		Arrays.sort(arrN);

		int m = sc.nextInt();
		int[] arrM = new int[m];
		for (int i = 0; i < m; i++) {
			arrM[i] = sc.nextInt();
			System.out.println(binarySearch(arrN, arrM[i]));
		}

	}

	public static int binarySearch(int[] arr, int num) {
		int fir = 0;
		int mid = 0;
		int last = arr.length - 1;
		while (fir <= last) {
			mid = (fir + last) / 2;
			if (arr[mid] == num) {
				return 1;
			} else if (arr[mid] < num) {
				fir = mid + 1;
			} else if (arr[mid] > num) {
				last = mid - 1;
			}
		}
		return 0;
	}

}