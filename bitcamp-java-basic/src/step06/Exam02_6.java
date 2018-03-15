// 메서드 : 가변 파라미터 vs 배열 파라미터
package step06;

import java.util.Scanner;

public class Exam02_6 {

    // 가변 파라미터
    static void hello(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }

    // 배열 파라미터
    static void hello2(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }

    public static void main(String[] args) {


        // 가변 파라미터의 메서드를 호출할 때는
        // 다음과 같이 낱개의 값을 여러 개 줄 수도 있고,
        hello("홍길동", "임꺽정", "유관순"); // 이 경우 names 배열의 개수는 3이다.
        System.out.println("----------------------------");
        
        // => 또는 다음과 같이 배열에 담아서 전달할 수도 있다.
        String[] arr = {"김구", "안중근", "윤봉길", "유관순"};
        hello(arr);
        System.out.println("--------------------------");


        // 배열 파라미터의 메서드를 호출할 때는
        // => 가변 파라미터와 달리 낱개의 값을 여러 개 줄 수 없다!
        //hello2("홍길동", "임꺽정", "유관순"); // 이 경우 names 배열의 개수는 3이다.
        //System.out.println("----------------------------");
        
        // => 오직 배열에 담아서 전달해야 한다.
        String[] arr2 = {"김구", "안중근", "윤봉길", "유관순"};
        hello2(arr2);
        System.out.println("--------------------------");

    }
}