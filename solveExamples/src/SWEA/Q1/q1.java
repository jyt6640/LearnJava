package SWEA.Q1;

import java.util.Scanner;
import java.io.FileInputStream;

public class q1 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();  // 테스트 케이스 수

		for (int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			int avg = 0;
			for (int i = 0; i < 10; i++) {
				int inputScore = sc.nextInt();
				sum += inputScore;
			}
			avg = (int) Math.round(sum / 10.0);
			System.out.println("#" + test_case + " " + sum / 10);
		}
	}
}
