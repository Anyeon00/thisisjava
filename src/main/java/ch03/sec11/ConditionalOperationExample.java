package ch03.sec11;

public class ConditionalOperationExample {
    int score = 85;
    char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//    System.out.println(score + "점은" + grade + "등급입니다"); 왜 오류?

}
