// JDBC 프로그래밍 개요 - JDBC 드라이버 타입 준비
package step25.ex1;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// - C:\Program Files (x86)\MySQL\Connector J 8.0\ 
public class Exam01_2 {
    
    public static void main(String[] args) throws Exception {
        
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
    }
}
