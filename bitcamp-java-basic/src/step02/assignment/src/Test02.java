/** 
 * # 과제(2018-03-06)
사용자로부터 5명의 성적 데이터를 (이름, 국어, 영어, 수학) 입력 받고 합계와 평균을 출력하라
## 실행 결과
```
> java -classpath bin step02.assignment.Test02
입력? 홍길동 100 90 80
입력? 임꺽정 100 100 100
입력? 유관순 90 90 90
입력? 안중근 80 80 80
입력? 윤봉길 70 70 70
-----------
홍길동 100 90 80 270 90.0
임꺽정 100 100 100 270 100.0
유관순 90 90 90 270 90.0
안중근 80 80 80 270 80.0
윤봉길 70 70 70 270 70.0 
>
``` 
*/

package step02.assignment;

public class Test02 {
    public static void main(String[] args) {
        
        /** 
*1단계: 1명의 성적 데이터 입력 받아서 처리하기
         * 
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name = keyScan.next();
        int kor = keyScan.nextInt();
        int eng = keyScan.nextInt();
        int math = keyScan.nextInt();

        int sum = kor + eng + math;
        float average = sum / 3;

        System.out.println("------------------------------");
        System.out.print(name);
        System.out.print(" ");
        System.out.print(kor);
        System.out.print(" ");
        System.out.print(eng);
        System.out.print(" ");
        System.out.print(math);
        System.out.print(" ");
        System.out.print(sum);
        System.out.print(" ");
        System.out.print(average);
        System.out.println();
    */





    /**
* 2단계: 여러 명의 성적 정보를 받아서 처리하기
     * 
     * java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name1 = keyScan.next();
        int kor1 = keyScan.nextInt();
        int eng1 = keyScan.nextInt();
        int math1 = keyScan.nextInt();

        int sum1 = kor1 + eng1 + math1;
        float average1 = sum1 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name2 = keyScan.next();
        int kor2 = keyScan.nextInt();
        int eng2 = keyScan.nextInt();
        int math2 = keyScan.nextInt();

        int sum2 = kor2 + eng2 + math2;
        float average2 = sum2 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name3 = keyScan.next();
        int kor3 = keyScan.nextInt();
        int eng3 = keyScan.nextInt();
        int math3 = keyScan.nextInt();

        int sum3 = kor3 + eng3 + math3;
        float average3 = sum3 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name4 = keyScan.next();
        int kor4 = keyScan.nextInt();
        int eng4 = keyScan.nextInt();
        int math4 = keyScan.nextInt();

        int sum4 = kor4 + eng4 + math4;
        float average4 = sum4 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        String name5 = keyScan.next();
        int kor5 = keyScan.nextInt();
        int eng5 = keyScan.nextInt();
        int math5 = keyScan.nextInt();

        int sum5 = kor5 + eng5 + math5;
        float average5 = sum5 / 3;

        System.out.println("------------------------------");
        System.out.print(name1);
        System.out.print(" ");
        System.out.print(kor1);
        System.out.print(" ");
        System.out.print(eng1);
        System.out.print(" ");
        System.out.print(math1);
        System.out.print(" ");
        System.out.print(sum1);
        System.out.print(" ");
        System.out.print(average1);
        System.out.println();

        System.out.print(name2);
        System.out.print(" ");
        System.out.print(kor2);
        System.out.print(" ");
        System.out.print(eng2);
        System.out.print(" ");
        System.out.print(math2);
        System.out.print(" ");
        System.out.print(sum2);
        System.out.print(" ");
        System.out.print(average2);
        System.out.println();

        System.out.print(name3);
        System.out.print(" ");
        System.out.print(kor3);
        System.out.print(" ");
        System.out.print(eng3);
        System.out.print(" ");
        System.out.print(math3);
        System.out.print(" ");
        System.out.print(sum3);
        System.out.print(" ");
        System.out.print(average3);
        System.out.println();

        System.out.print(name4);
        System.out.print(" ");
        System.out.print(kor4);
        System.out.print(" ");
        System.out.print(eng4);
        System.out.print(" ");
        System.out.print(math4);
        System.out.print(" ");
        System.out.print(sum4);
        System.out.print(" ");
        System.out.print(average4);
        System.out.println();

        System.out.print(name5);
        System.out.print(" ");
        System.out.print(kor5);
        System.out.print(" ");
        System.out.print(eng5);
        System.out.print(" ");
        System.out.print(math5);
        System.out.print(" ");
        System.out.print(sum5);
        System.out.print(" ");
        System.out.print(average5);
        System.out.println();
     */





     /**
* 3단계: 변수 선언을 모아서 일괄적으로 처리하기

      * // 사용할 변수를 먼저 선언한다.
        String name1, name2, name3, name4, name5;
        int kor1, kor2, kor3, kor4, kor5;
        int eng1, eng2, eng3, eng4, eng5;
        int math1, math2, math3, math4, math5;
        int sum1, sum2, sum3, sum4, sum5;
        float average1, average2, average3, average4, average5;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name1 = keyScan.next();
        kor1 = keyScan.nextInt();
        eng1 = keyScan.nextInt();
        math1 = keyScan.nextInt();

        sum1 = kor1 + eng1 + math1;
        average1 = sum1 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name2 = keyScan.next();
        kor2 = keyScan.nextInt();
        eng2 = keyScan.nextInt();
        math2 = keyScan.nextInt();

        sum2 = kor2 + eng2 + math2;
        average2 = sum2 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name3 = keyScan.next();
        kor3 = keyScan.nextInt();
        eng3 = keyScan.nextInt();
        math3 = keyScan.nextInt();

        sum3 = kor3 + eng3 + math3;
        average3 = sum3 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name4 = keyScan.next();
        kor4 = keyScan.nextInt();
        eng4 = keyScan.nextInt();
        math4 = keyScan.nextInt();

        sum4 = kor4 + eng4 + math4;
        average4 = sum4 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name5 = keyScan.next();
        kor5 = keyScan.nextInt();
        eng5 = keyScan.nextInt();
        math5 = keyScan.nextInt();

        sum5 = kor5 + eng5 + math5;
        average5 = sum5 / 3;

        System.out.println("------------------------------");
        System.out.print(name1);
        System.out.print(" ");
        System.out.print(kor1);
        System.out.print(" ");
        System.out.print(eng1);
        System.out.print(" ");
        System.out.print(math1);
        System.out.print(" ");
        System.out.print(sum1);
        System.out.print(" ");
        System.out.print(average1);
        System.out.println();

        System.out.print(name2);
        System.out.print(" ");
        System.out.print(kor2);
        System.out.print(" ");
        System.out.print(eng2);
        System.out.print(" ");
        System.out.print(math2);
        System.out.print(" ");
        System.out.print(sum2);
        System.out.print(" ");
        System.out.print(average2);
        System.out.println();

        System.out.print(name3);
        System.out.print(" ");
        System.out.print(kor3);
        System.out.print(" ");
        System.out.print(eng3);
        System.out.print(" ");
        System.out.print(math3);
        System.out.print(" ");
        System.out.print(sum3);
        System.out.print(" ");
        System.out.print(average3);
        System.out.println();

        System.out.print(name4);
        System.out.print(" ");
        System.out.print(kor4);
        System.out.print(" ");
        System.out.print(eng4);
        System.out.print(" ");
        System.out.print(math4);
        System.out.print(" ");
        System.out.print(sum4);
        System.out.print(" ");
        System.out.print(average4);
        System.out.println();

        System.out.print(name5);
        System.out.print(" ");
        System.out.print(kor5);
        System.out.print(" ");
        System.out.print(eng5);
        System.out.print(" ");
        System.out.print(math5);
        System.out.print(" ");
        System.out.print(sum5);
        System.out.print(" ");
        System.out.print(average5);
        System.out.println();
      */




      /**
* 4단계: 배열을 사용하여 같은 종류의 메모리를 쉽게 만들기
       * // 배열을 사용하면 같은 종류의 메모리를 아주 간단하게 만들 수 있다.
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[0] = keyScan.next();
        kor[0] = keyScan.nextInt();
        eng[0] = keyScan.nextInt();
        math[0] = keyScan.nextInt();

        sum[0] = kor[0] + eng[0] + math[0];
        average[0] = sum[0] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[1] = keyScan.next();
        kor[1] = keyScan.nextInt();
        eng[1] = keyScan.nextInt();
        math[1] = keyScan.nextInt();

        sum[1] = kor[1] + eng[1] + math[1];
        average[1] = sum[1] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[2] = keyScan.next();
        kor[2] = keyScan.nextInt();
        eng[2] = keyScan.nextInt();
        math[2] = keyScan.nextInt();

        sum[2] = kor[2] + eng[2] + math[2];
        average[2] = sum[2] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[3] = keyScan.next();
        kor[3] = keyScan.nextInt();
        eng[3] = keyScan.nextInt();
        math[3] = keyScan.nextInt();

        sum[3] = kor[3] + eng[3] + math[3];
        average[3] = sum[3] / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name[4] = keyScan.next();
        kor[4] = keyScan.nextInt();
        eng[4] = keyScan.nextInt();
        math[4] = keyScan.nextInt();

        sum[4] = kor[4] + eng[4] + math[4];
        average[4] = sum[4] / 3;

        System.out.println("------------------------------");
        System.out.print(name[0]);
        System.out.print(" ");
        System.out.print(kor[0]);
        System.out.print(" ");
        System.out.print(eng[0]);
        System.out.print(" ");
        System.out.print(math[0]);
        System.out.print(" ");
        System.out.print(sum[0]);
        System.out.print(" ");
        System.out.print(average[0]);
        System.out.println();

        System.out.print(name[1]);
        System.out.print(" ");
        System.out.print(kor[1]);
        System.out.print(" ");
        System.out.print(eng[1]);
        System.out.print(" ");
        System.out.print(math[1]);
        System.out.print(" ");
        System.out.print(sum[1]);
        System.out.print(" ");
        System.out.print(average[1]);
        System.out.println();

        System.out.print(name[2]);
        System.out.print(" ");
        System.out.print(kor[2]);
        System.out.print(" ");
        System.out.print(eng[2]);
        System.out.print(" ");
        System.out.print(math[2]);
        System.out.print(" ");
        System.out.print(sum[2]);
        System.out.print(" ");
        System.out.print(average[2]);
        System.out.println();

        System.out.print(name[3]);
        System.out.print(" ");
        System.out.print(kor[3]);
        System.out.print(" ");
        System.out.print(eng[3]);
        System.out.print(" ");
        System.out.print(math[3]);
        System.out.print(" ");
        System.out.print(sum[3]);
        System.out.print(" ");
        System.out.print(average[3]);
        System.out.println();

        System.out.print(name[4]);
        System.out.print(" ");
        System.out.print(kor[4]);
        System.out.print(" ");
        System.out.print(eng[4]);
        System.out.print(" ");
        System.out.print(math[4]);
        System.out.print(" ");
        System.out.print(sum[4]);
        System.out.print(" ");
        System.out.print(average[4]);
        System.out.println();
       */





       /**
* 5단계: 반복문을 사용하여 입력과 출력 코드를 간단히 하라!
        *  // 배열을 사용하면 같은 종류의 메모리를 아주 간단하게 만들 수 있다.
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        for (int i = 0; i < 5; i++) {
            System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
        
            sum[i] = kor[i] + eng[i] + math[i];
            average[i] = sum[i] / 3;
        }

        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print(name[i]);
            System.out.print(" ");
            System.out.print(kor[i]);
            System.out.print(" ");
            System.out.print(eng[i]);
            System.out.print(" ");
            System.out.print(math[i]);
            System.out.print(" ");
            System.out.print(sum[i]);
            System.out.print(" ");
            System.out.print(average[i]);
            System.out.println();
        }
        */





        /**
* // 6단계: 형식을 갖춘 문자열 출력하기
         * // 배열을 사용하면 같은 종류의 메모리를 아주 간단하게 만들 수 있다.
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        for (int i = 0; i < 5; i++) {
            System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
        
            sum[i] = kor[i] + eng[i] + math[i];
            average[i] = sum[i] / 3;
        }

        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %d %d %d %f\n", 
                name[i], kor[i], eng[i], math[i], sum[i], average[i]);
        }
         */
    }
}
