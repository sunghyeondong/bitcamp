// 게시판 관리 - 등록
package step25.ex4;

import java.util.Scanner;

public class Exam01_insert {
    
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);

        Board board = new Board();
        
        
        System.out.print("제목? ");
        board.setTitle(keyScan.nextLine());
        
        System.out.print("내용? ");
        board.setContent(keyScan.nextLine());
        
        try {
            DataSource dataSource = new DefaultDataSource();
            BoardDao boardDao = new BoardDao(dataSource);
            int count = boardDao.insert(board);
            System.out.printf("%d 개 입력 성공!", count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        keyScan.close();
    }
}
