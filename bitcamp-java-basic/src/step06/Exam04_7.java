// 메서?�� : ?��?�� 메모�? ?��?�� III - ?��?�� ?��버플로우
package step06;

public class Exam04_7 {

    static int sum(int value) {
        //종료 조건?�� 빼버리면, 무한?���? ?��출한?��.
        long a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        long a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        long a21, a22, a23, a24, a25, a26, a27, a28, a29, a30;
        System.out.println(value);
        return value + sum(value - 1);
    }

    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}
