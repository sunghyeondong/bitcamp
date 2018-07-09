// 응용 - 게산기 서버 만들기 - connectionless(=stateless)방식
package step23.ex4;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// connectionless
// => 한 번 요청에 한 번 응답을 하는 방식

public class CalcServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행중...");
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());
    
            int a = in.readInt();
            String op = in.readUTF();
            int b = in.readInt();
            int result = 0;
            
            switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            }
    
            out.printf("%d %s %d = %d\n", a, op, b, result);
            
            in.close();
            out.close();
            socket.close();
        }
        //ss.close();
    }
}
