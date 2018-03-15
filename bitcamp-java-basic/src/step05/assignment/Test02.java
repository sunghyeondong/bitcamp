/**
 * #과제(2018-03-13)
사용자로부터 마름모의 가로 길이를 숫자를 입력 받아 '*' 문자로 그려라.
## 구현 조건
반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!

## 실행 결과
```

>java -classpath bin step05.assignment.Test01
밑변 길이? 5
*
**
***
****
*****
****
***
**
*
>
```
 */
package step05.assignment;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        System.out.print("가로 길이? ");
        int len = keyScan.nextInt();

        int count = 1;
        while (count <= len) {
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count++;

        }

        count = len - 1;
        while (count >= 1) {
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count--;

        }
    }
}