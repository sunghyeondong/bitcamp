// DB 커넥션 객체를 관리하는 역할
// => 빌려주는 역할을 수행한다.
package step25.ex4;

import java.sql.Connection;

public interface DataSource {
    Connection getConnection() throws Exception;
    void returnConnection(Connection con);
}



