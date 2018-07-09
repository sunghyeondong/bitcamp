// 스레드의 생명주기(lifecycle)
package step24.ex4;

public class Exam01 {
    public static void main(String[] args) {
        // 스레드의 생명주기
        // new Thread()     start()                       sleep()/wait()
        //     준비 -------------------------> Running ---------------------> Not Runnable
        //                                      |    <---------------------
        //                                      |        timeout/notify()
        //                                      |
        //                                      |     run() 메서드 종료
        //                                      V
        //                                     Dead
        
        System.out.println("스레드 실행 전");
        new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }.start();
        
        System.out.println("스레드 실행 후");
        // main() 메서드의 호출이 끝나더라도 다른 스레드의 실행이 종료될 때까지
        // JVM은 종료하지 않는다.
    }
}
