// DAO와 서비스 객체 사이에서 데이터를 실어 나르는 용도로 사용한다.
// => DTO(Data Transfer Object)라 부른다.
// => "도메인 객체(domain)"라고도 부른다.
package step25.ex9;

import java.io.Serializable;
import java.sql.Date;

// 외부 저장소로 객체를 내보낼 수 있도록 serial 기능을 활성화 시킨다.
public class Board implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    int no;
    String title;
    String content;
    Date registeredDate;
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", registeredDate=" + registeredDate
                + "]";
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    
    
}
