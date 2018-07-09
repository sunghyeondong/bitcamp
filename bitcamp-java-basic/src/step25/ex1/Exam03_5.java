// JDBC 프로그래밍 개요 - JDBC 드라이버 타입 준비
package step25.ex1;

import java.sql.DriverManager;

public class Exam03_5 {
    
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false", "java106", "1111");
        
        System.out.println("DBMS와 연결 됨!");
        
        java.sql.Statement stmt = con.createStatement();
        
        int count = stmt.executeUpdate("update ex_board set titl='okok2' where bno=9");
        System.out.printf("%d 개 변경 성공!", count);
        
        stmt.close();
        con.close();
    }
}
