// ë©”ì„œ?“œ : ?Š¤?ƒ ë©”ëª¨ë¦? ?‘?š© III - ?Š¤?ƒ ?˜¤ë²„í”Œë¡œìš°
package step06;

public class Exam04_7 {

    static int sum(int value) {
        //ì¢…ë£Œ ì¡°ê±´?„ ë¹¼ë²„ë¦¬ë©´, ë¬´í•œ?œ¼ë¡? ?˜¸ì¶œí•œ?‹¤.
        long a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        long a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        long a21, a22, a23, a24, a25, a26, a27, a28, a29, a30;
        System.out.println(value);
        return value + sum(value - 1);
    }

    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}
