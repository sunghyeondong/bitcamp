// 기존의 코드를 복사하여 Car 클래스에 코드를 추가 했다.
package step11.ex03;

public class Car2 {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
    public Car2() {}
    
    // 이전 프로그램(ex1.Exam01)에서 다음 생성자를 사용하기 때문에
    // 이 생성자의 파라미터를 덧 붙일 수는 없다.
    public Car2(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }

    // 새로 생성자를 추가해야 한다.
    public Car2(String model, String maker, int capacity, boolean sunroof, boolean auto) {
        // 이 클래스의 다른 생성자를 먼저 호출할 수 있다.
        // => 이 때 this()를 사용한다.
        this(model, maker, capacity);
        
        this.sunroof = sunroof;
        this.auto = auto;
    }
}
