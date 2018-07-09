// java.util.hashMap - 값을 저장할 때 key을 사용하여 저장한다.
package step12.ex6;

public class Member {
    String name;
    int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
        
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }
        
    public static void main(String[] args) {

    }

}
