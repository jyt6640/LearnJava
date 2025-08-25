package ch04;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        int myMoney = 0;
        boolean run = true;

        while(run) {
            System.out.println("-------------------------");
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("-------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("선택> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("예금액> ");
                    int deposit = sc.nextInt();
                    myMoney += deposit;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdraw = sc.nextInt();
                    myMoney -= withdraw;
                    break;
                case 3:
                    System.out.print("잔고> " + myMoney);
                    System.out.println();
                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
