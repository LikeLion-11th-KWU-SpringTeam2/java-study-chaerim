import java.util.*;

public class Baekjoon_2744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {

                res.append(Character.toUpperCase(c));
            }
        }
        System.out.println(res);
    }
}
