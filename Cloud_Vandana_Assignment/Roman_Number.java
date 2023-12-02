package JavaCodes;

import java.util.Scanner;

public class Roman_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman Number");
		String num = sc.next();
		int realNum = 0;
		int arr[] = new int[num.length()];

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == 'I') {
				arr[i] = 1;
			}
			if (num.charAt(i) == 'V') {
				arr[i] = 5;
			}
			if (num.charAt(i) == 'X') {
				arr[i] = 10;
			}
			if (num.charAt(i) == 'L') {
				arr[i] = 50;
			}
			if (num.charAt(i) == 'C') {
				arr[i] = 100;
			}
		}

		for (int i = 0; i < arr.length; i = i + 2) {
			for (int j = i + 1; j < arr.length;) {
				if (arr[i] < arr[j]) {
					realNum += arr[j] - arr[i];
					break;
				} else {
					realNum += arr[j] + arr[i];
					break;
				}
			}
		}
		System.out.println(realNum);
		sc.close();
	}

}
