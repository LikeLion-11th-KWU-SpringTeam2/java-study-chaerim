package Ch7.App.src;

// Chapter7 - 반복문
public class Loops {
    public static void main(String[] args) {
        // 1. for문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 2. while문
        int b = 10;
        while (b > 0) {
            System.out.println(b);
            b -= 1;
        }

        int a = 10;
        // 한 번은 무조건 실행
        do {
            System.out.println(a);
            a--;
        } while (a > 0);
    }
}
