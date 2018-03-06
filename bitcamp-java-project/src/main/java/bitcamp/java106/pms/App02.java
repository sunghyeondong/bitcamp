/**
 * ## src02 - 키보드 입력 과 변수
- 학습목표
  - 키보드로부터 데이터를 입력 받는 방법을 익힌다.
  - 사용자가 입력한 값을 메모리에 보관하는 방법을 익힌다.
- 작업내용
  - 사용자로부터 팀 정보를 입력 받아 출력하라.
- 실행 결과
```
> java -classpath bin bitcamp.java106.pms.App
팀명? 비트비트
설명? 자바 프로젝트 팀
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20
---------------------------
팀명: 비트비트
설명:
자바 프로젝트 팀
최대인원: 5명
일자: 2018-05-05 ~ 2018-08-20
>
 */

package bitcamp.java106.pms;

public class App02 {
    public static void main(String[] args) {

        String a1, a2, a4, a5;
        int a3;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("팀명? ");
        a1 = keyScan.nextLine();
        System.out.print("설명? ");
        a2 = keyScan.nextLine();
        
        System.out.print("최대인원? ");
        a3 = keyScan.nextInt();
        keyScan.nextLine(); // 숫자 뒤에 줄바꿈 코드를 읽는다.
                            // 읽고 난 뒤에 아무것도 안하기 떄문에
                            // 일종의 줄바꿈 코드를 제거하는 효과가 있다.

        System.out.print("시작일? ");
        a4 = keyScan.nextLine();
        System.out.print("종료일? ");
        a5 = keyScan.nextLine();

        System.out.println("----------------------------------");

        System.out.println("팀명: " + a1);
        System.out.println("설명: " + "\n" + a2);
        System.out.println("최대인원: " + a3 + "명");
        System.out.println("일자: " + a4 + " ~ " + a5);

    }
}