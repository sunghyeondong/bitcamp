// 던지는 예외 받기 - 예외 처리 안하면 컴파일 오류!
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_1 {

    static void m(int i) 
            throws Exception, RuntimeException, SQLException, IOException {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }
    
    public static void main(String[] args) {
        // 예외를 던질 수 있다고 선언된 메서드를 호출할 때
        // 그 예외를 처리하지 않으면 컴파일 오류가 발생한다.
        m(1);
    }

}
