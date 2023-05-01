package Ch7.App.src;

// Chapter7 - 조건문
import java.util.*;

public class Conditional {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 100;

        // 다중 조건의 경우 조건을 만족하는 최초의 분기만 실행.
        if (a != b) {
            System.out.println("a != b");
        } else if (a < b) {
            System.out.println("a < b");
        }

        switch (a + 1) {
            case 2:
                System.out.println("a+1==2");
                break;
            case 3:
                System.out.println("a+1==3");
                break;
            case 4:
                System.out.println("a+1==4");
                break;
            default:
                System.out.println("default");
        }
    }
}
