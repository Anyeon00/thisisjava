package Problem.part2;

import java.util.Scanner;

public class Ch05Num9 {
    public static void main(String[] args) {
<<<<<<< HEAD
/*
=======
>>>>>>> origin/main
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            int[] arr = new int[100];
            int sum = 0;
            int max = 0;

            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.print("학생수> ");
                int a = sc.nextInt();
                arr = new int[a];
            } else if (choose == 2) {
                for(int i = 0; i < arr.length; i++){
                    System.out.print("scores[" + i + "]> ");
                    arr[i] = sc.nextInt();
                }
            } else if (choose == 3){
                for(int i = 0; i < arr.length; i++) {
                    System.out.println("scores[" + i + "]: " + arr[i]);
                }
            } else if (choose == 4){
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {     //max
                        max = arr[i];
                    }
                    sum += arr[i];      //sum
                }
                double avg = (double) sum / arr.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if(choose == 5){
                System.out.println("프로그램 종료");
                break;
            }
        }
<<<<<<< HEAD
*/
=======
>>>>>>> origin/main
    }
}
