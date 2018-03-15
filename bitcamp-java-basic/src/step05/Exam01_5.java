package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_5 {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 19)
            if (age >= 70)
                System.out.println("지하철 무임승차 가능합니다.");
        else
            System.out.println("미성년입니다.");
    }
}