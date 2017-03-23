package introduction;

import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// initializing array
		int[] numbers = new int[num];
		// inserting values into the array
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < num; i++) {
			int sum = numbers[i];
			if (sum < 0)
				count++;
			// adding the values of sub array
			for (int j = i + 1; j < num; j++) {
				sum += numbers[j];
				if (sum < 0)
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
