// 다중 인터페이스 구현
package step14.ex3;

// 클래스는 여러 개의 규칙을 이행할 수 있다.
public class Exam02 implements B, C {
    public void m2() {} // B 인터페이스 뿐만 아니라,
    public void m1() {} // B의 수퍼 인터페이스의 메서드까지 구현해야 한다.
    public void m3() {} // C의 인터페이스 구현
}
