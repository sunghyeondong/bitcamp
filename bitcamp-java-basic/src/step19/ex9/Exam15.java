// IoC 컨테이너 만들기 - 애노테이션을 사용하여 객체의 이름 지정하기
package step19.ex9;

public class Exam15 {
    public Exam15() {
        System.out.println("===> Exam15()");
    }
    public static void main(String[] args) throws Exception {
        ApplicationContext10 iocContainer = new ApplicationContext10("step19.ex9");
        Car car2 = (Car) iocContainer.getBean("car");
        car2.move();
    }
}





