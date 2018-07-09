// IoC 컨테이너 만들기 - 1) 특정 패키지의 파일 목록 알아내기
package step19.ex1;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

// => 디렉토리의 파일 목록을 다루는 메서드를 별도의 클래스로 분리한다.
public class Exam03 {
    
    public static void main(String[] args) {
        // 1) 패키지 경로 준비
        File packageDir = new File("C:\\Users\\tjdgu\\git\\bitcamp\\bitcamp-java-basic\\bin\\step19\\ex1");
        
        // 2) 해당 디렉토리에서 파일 목록을 가져오기
        ApplicationContext appContext = new ApplicationContext(packageDir);
        List<File> files = appContext.getFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else {
                System.out.printf("- %s\n", f.getName());
            }
        }
    }
    
    
    
}
