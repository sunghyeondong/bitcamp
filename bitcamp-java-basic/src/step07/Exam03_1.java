// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;

public class Exam03_1 {
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입의 값을 연산자를 사용하여 다뤄보자!
        Score2 score = new Score2();

        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;

        // 다음은 Score에 값을 다루는 연산자가 없을 때의 예이다.
        //score.sum = score.kor + score.eng + score.math;
        //score.average = (float)score.sum / (float)3;
        
        Score2.calculate(score);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                score.name, score.kor, score.eng, score.math, score.sum, score.average);
    }
}
// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
//    - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
//    - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.