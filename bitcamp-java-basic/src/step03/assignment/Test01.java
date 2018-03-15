/**
 * #과제(2018-03-07)
사용자로부터 입력 받은 성적 데이터(이름, 국어, 영어, 수학)를 클래스 문법을
이용하여 만든 메모리에 저장하라. 또한 평균 합계를 구하고 출력하라. 입력과 출력에 반복문을 적용하라!
## 실행 결과
```

>java -classpath bin step03.assignment.Test01
입력: 홍길동 100 100 100
입력: 임꺽정 90 90 90
입력: 유관순 80 80 80
-------------------------
홍길동 100 100 100 300 100.0
임꺽정  90  90  90 270 90.0
유관순  80  80  80 240 80.0
>
```
 */

package step03.assignment;

public class Test01 {
    public static void main(String[] args) {

        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        step03.Score[] scores = new step03.Score[3];
        
        for(int i = 0; i < scores.length; i++){
            scores[i] = new step03.Score();
            
            System.out.print("입력: ");
            scores[i].name = keyScan.next();
            scores[i].kor = keyScan.nextInt();
            scores[i].eng = keyScan.nextInt();
            scores[i].math = keyScan.nextInt();
            scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
            scores[i].aver = scores[i].sum / 3;
        }

        System.out.println("--------------------------");

        for(int i = 0; i < scores.length; i++){
            System.out.printf("%s %3d %3d %3d %3d %5.1f\n", scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
        }












        /**class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);


        Score[]arr = new Score[6];


        for(int i = 0; i < 3; i++){
            arr[i] = new Score();
            System.out.print("입력? ");
            arr[i].name = keyScan.next();
            arr[i].kor = keyScan.nextInt();
            arr[i].eng = keyScan.nextInt();
            arr[i].math = keyScan.nextInt();
        
            arr[i].sum = arr[i].kor + arr[i].eng + arr[i].math;
            arr[i].aver = arr[i].sum / 3;

            System.out.printf("이름: %s %d %d %d\n", arr[i].name, arr[i].kor, arr[i].eng, arr[i].math);
            arr[i].sum = arr[i].kor + arr[i].eng + arr[i].math;
            arr[i].aver = arr[i].sum / 3;
        }

        System.out.println("--------------------------");

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s %d %d %d %d %f\n", arr[i].name, arr[i].kor, arr[i].eng, arr[i].math, arr[i].sum, arr[i].aver);
        } */

        }
    }