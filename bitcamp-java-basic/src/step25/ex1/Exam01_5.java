// JDBC 프로그래밍 개요 - JDBC 드라이버 타입 준비
package step25.ex1;

import java.sql.DriverManager;

public class Exam01_5 {
    
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        java.sql.Driver driver = DriverManager.getDriver("jdbc:mysql:");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
    }
}
