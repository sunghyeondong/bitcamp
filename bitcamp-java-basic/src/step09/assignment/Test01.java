/*
 * # 과제(2018-03-21)
 * 사용자로부터 년, 월, 일 데이터를 입력 받아서
 * 요일과 몇번째 주인지 출력하라!
 * 그리고 1년 중에 몇일 째인지 출력하라!
 * 
 * ## 실행 결과
 * ```
 * > java -classpath bin step09.assignment.Test01
 * 년,월,일?(예: 2018 3 21)
 * 요일: 수요일
 * 주차: 4주차
 * 일차: 81일차
 * ```
 */

package step09.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("년,월,일?(예: 2018 3 21)");
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int day = keyScan.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day);
        
        String[] weeks = {"", "일", "월", "화", "수", "목", "금", "토"};
        
        //int i = c.get(Calendar.DAY_OF_WEEK);
        //System.out.printf("요일: %d요일\n", weeks[i]);
        System.out.printf("요일: %s요일\n", weeks[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차: %d주차\n", c.get(Calendar.WEEK_OF_MONTH));
        System.out.printf("일차: %d일차\n", c.get(Calendar.DAY_OF_YEAR));
        
        
    }

}
