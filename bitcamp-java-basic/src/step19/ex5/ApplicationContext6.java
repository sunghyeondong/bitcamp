// 클래스 이름으로 클래스를 로딩하여 Class 객체를 저장한다.
package step19.ex5;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContext6 {
    private ArrayList<Class> list = new ArrayList<>();
    
    public ApplicationContext6(String packageName) throws Exception {
        String path = packageName.replace(".", "/");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(path);
        File dir = new File(url.getPath());
        
        if (!dir.isDirectory())
            return;
        findFiles(dir, packageName);
    }
    
    private void findFiles(File dir, String packageName) throws Exception {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || 
                        (pathname.getName().endsWith(".class") && !pathname.getName().contains("$"))) {
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            if(f.isDirectory()) {
                findFiles(f, packageName + "." + f.getName());
            } else {
                String classname = f.getName();
                
                this.list.add(Class.forName(packageName + "." + classname.substring(0, classname.length() - 6)));
            }
        }
    }

    public List<Class> getFiles() {
        return this.list;
    }
}
