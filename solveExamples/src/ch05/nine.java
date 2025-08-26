package ch05;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        int students = 0;
        boolean run = true;
        int scores[] = null;
        int max = 0;
        int sum = 0;
        while(run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("선택> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    students = sc.nextInt();
                    scores = new int[students];
                    break;
                case 2:
                    for (int i = 0; i < students; i++) {
                        System.out.print("score[" + i + "]> ");
                        int withdraw = sc.nextInt();
                        scores[i] = withdraw;
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("score[" + i + "]: " + scores[i]);
                    }
                    break;
                case 4:
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + sum / scores.length);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
