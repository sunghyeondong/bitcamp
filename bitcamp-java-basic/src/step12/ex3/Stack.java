// Stack : LIFO. push()/pop()
package step12.ex3;

import step12.ex2.LinkedList;

// 스택 사용의 예: 
// - 웹 브라우저의 history 다룰 때
// - 웹 사이트에서 breadcrumb navigation 구현할 때
// - 웹 페이지 UI의 이벤트를 처리할 때
public class Stack extends LinkedList{
    public void push(Object value) {
        this.add(value);
    }
    
    public Object pop() {
        if (this.head == this.tail) 
            return null;
        
        Bucket removedBucket = this.tail.prev;
        if (this.tail.prev.prev != null) { // 리스트에서 중간 버킷 제거할 때 
            this.tail.prev.prev.next = tail;
            this.tail.prev = this.tail.prev.prev;
        } else { // 리스트에서 맨 처음 버킷을 제거할 때
            head = tail;
            head.prev = null;
        }
        return removedBucket.value;
    }
}
