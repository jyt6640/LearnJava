package ch05.second.Q9;

import java.util.Scanner;

public class scoreAnalyze {
	public static void main(String[] args){
        int[] scores = new int[0];
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = sc.nextInt();

            switch (selectNo) {
                case 1:
                    System.out.print("학생수> ");
                    int studentNum = sc.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    for (int i = 0; i<scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i<scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case 4:
                    int max = 0;
                    int sum = 0;
                    double avg = 0.0;
                    for (int score : scores) {
                        sum += score;
                        if (max < score) {
                            max = score;
                        }
                    }
                    System.out.println("최고 점수: " + max);
                    avg = (double) sum / scores.length;
                    System.out.println("평균 점수: " + avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
