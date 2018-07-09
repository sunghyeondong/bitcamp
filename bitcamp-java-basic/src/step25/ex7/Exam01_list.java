// 게시물 관리 - 목록
package step25.ex7;

import java.sql.DriverManager;

public class Exam01_list {
    
    public static void main(String[] args) throws Exception {
        
        Class.forName("org.mariadb.jdbc.Driver");
        
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/java106db",
                "java106", "1111");
        
        java.sql.Statement stmt = con.createStatement();
        
        java.sql.ResultSet rs = stmt.executeQuery("select bno,titl,rdt from ex_board");
        
        while (rs.next()) {
            System.out.printf("%d,%s,%s\n", 
                    rs.getInt("bno"), rs.getString("titl"), rs.getDate("rdt"));
        }
        
        stmt.close();
        con.close();
        rs.close();
    }
}
