package Problem.part1;

import java.util.Scanner;

public class Ch4Num7 {
    public static void main(String[] args) {
            /*
        1. 예 출 잔 종 print
        2. 예금
        2-1. 예금 선택시 예금금액 scan받아 저장
        3. 출금
        3-1. 출금 선택시 출금금액 scan받아 잔고 - 출금금액 저장
        4. 잔고
        4-1 잔고 선택시 잔고 print
        5. 종료
        5-1 종료 선택시 프로그램 종료
        */
        Scanner sc = new Scanner(System.in);
        int account = 0;

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");

            String choose = sc.nextLine();
            if (choose.equals("1")) {   //1.예금 선택시
                System.out.print("예금액>");
                int a = sc.nextInt();
                account += a;
            } else if (choose.equals("2")) {    //2.출금 선택시
                System.out.print("출금액>");
                int b = sc.nextInt();
                account -= b;
            } else if (choose.equals("3")) {    //3. 잔고 선택시
                System.out.print("잔고>");
                System.out.println(account);
            } else if (choose.equals("4")) {    //4. 종료 선택시
                break;
            }
        }
    }

}
