package com.xworkz.Programs;

public class FindFirstAndLast {
	public static void firstAndLast(int arr[], int x) {

		int n = arr.length;
		int first = -1, last = -1;
		for (int i = 0; i < n; i++) {
			if (x != arr[i])
				continue;
			if (first == -1)
				first = i;
			last = i;
		}
		if (first != -1) {
			System.out.println("First Occurrence = " + first);
			System.out.println("Last Occurrence = " + last);
		} else {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int x = 8;
		firstAndLast(arr, x);

	}

}
