// 상속 - 수퍼 클래스에 기본 생성자가 없을 때 다른 생성자를 호출하는 방법!
package step11.ex07;

public class Exam01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.v1 = 100;
        obj.v2 = 200;
        System.out.printf("v1=%d, v2=%d\n", obj.v1, obj.v2);
        
    }
}

