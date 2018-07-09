// Build을 상속 받아 startEffect()와 endEffect()를 구체화 시킨다.
package step15.ex3;

public class Farm extends Building{
    @Override
    public void startEffect() {
        System.out.println("땅을 고른다...");
    }

    @Override
    public void endEffect() {
        System.out.println("씨앗을 뿌린다....");
    }
    
}
