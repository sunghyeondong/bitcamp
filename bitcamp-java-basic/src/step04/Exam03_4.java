// 논리 연산자 : || vs |
package step04;

public class Exam03_4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean r = a || (b = true);
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

        a = true;
        b = false;
        r = a | (b = true);
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    }
}
