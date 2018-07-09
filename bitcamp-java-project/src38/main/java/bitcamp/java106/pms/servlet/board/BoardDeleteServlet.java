package bitcamp.java106.pms.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/board/delete")
public class BoardDeleteServlet extends HttpServlet {
    
    BoardDao boardDao;
    
    @Override
    public void init() throws ServletException {
        boardDao = InitServlet.getApplicationContext().getBean(BoardDao.class);
    }

    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            int count = boardDao.delete(no);
            if (count == 0) {
                throw new Exception("해당 게시물이 없습니다.");
            }
            response.sendRedirect("list");
            
        } catch (Exception e) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta http-equiv='Refresh' content='5;url=list'>");
            out.println("<title>게시물 삭제</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>게시물 삭제 실패!</h1>");
            out.println("<pre>");
            e.printStackTrace(out);
            out.println("</pre>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}

//ver 38 - redirect 적용
//ver 37 - BoardDeleteController를 서블릿으로 변경
//         결과를 HTML로 출력
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 delete() 메서드를 추출하여 클래스로 정의. 
