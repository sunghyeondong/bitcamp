// 스레드의 생명주기(lifecycle) - running 상태
package step24.ex4;

public class Exam06 {
    public static void main(String[] args) throws Exception {
        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 100000000; i++)
                    Math.asin(38.567);
                long endTime = System.currentTimeMillis();
                System.out.printf("MyThread = %d\n", endTime - startTime);
            }
        }
        
        Thread.currentThread().setPriority(1);
        MyThread t1 = new MyThread("t1");
        t1.setPriority(10);
        // 유닉스 계열의 OS는 스케쥴링에서 우선 순위를 고려하여 CPU를 배분한다.
        // 그러나 Windows OS는 우선 순위를 덜 고려하여 CPU를 배분한다.
        // 그러다보니 우선 순위를 조정하여 작업을 처리하도록 프로그램을 짜게 되면,
        // 유닉스 계열에서 실행할 때는 의도한 대로 동작할지 모르지만,
        // 윈도우에서는 의도대로 동작하지 않을 것이다.
        // 따라서 프로그램을 짤 때 스레드의 우선 순위를 조정하는 방법에 의존하지 말라!
        
        System.out.printf("main 스레드 우선 순위: %d\n", Thread.currentThread().getPriority());
        
        System.out.printf("%s 스레드 우선 순위: %d\n", t1.getName(), t1.getPriority());
        
        t1.start();
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++)
            Math.asin(38.567);
        long endTime = System.currentTimeMillis();
        System.out.printf("main = %d\n", endTime - startTime);
        
    }
}
