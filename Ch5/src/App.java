
// Chapter5 - 자바 변수와 자료형
// Chapter6 - 자바 연산자
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 변수 -> 데이터가 저장되는 공간
        int num = 1; // 4바이트
        double width = 12.34; // 8바이트

        String content = "Programming"; // 참조형 데이터
        // heap에 할당하고 content에는 주소값만 넣어줌

        num = 10;
        System.out.println(num);

        // 변수 생성 규칙
        // 1. 1개의 변수 -> 1개의 값만 할당 가능
        // 2. 변수에 저장된 값 -> 재할당을 통해 변경 가능
        // 3. 값의 형태에 맞는 자료형을 사용하자.
        // 4. 변수명은 소문자로 시작
        // 5. 대소문자 구분, 공백 포함 불가능
        // 6. 예약어는 변수명으로 사용 불가능

        // 변수 기본형 1 : 정수형
        // 1. byte(1byte, 8bits) : -2^7 ~ 2^7-1의 범위
        // 2. short(2bytes) : -2^15 ~ 2^15-1의 범위
        // 3. int(4bytes) : -2^31 ~ 2^31-1의 범위
        // 4. long(8bytes) : -2^63 2^63-1의 범위

        // 변수 기본형 2 : 실수형
        // 1. double(8bytes) - 기본적, 소수점 이하 15자리까지 정밀도
        // 2. float(4bytes) - 7자리까지의 정밀도
        float a = 9.45f;

        // 변수 기본형 3 : 문자형
        // 1. char(2byte) : 항상 작은따옴표로 감싸주자.
        char char_1 = 'a';
        char char_2 = 97; // 아스키코드 값 출력
        char char_3 = 0x61; // 유니코드 값 출력
        System.out.println(char_2);
        System.out.println(char_3);

        // 변수 기본형 4 : 논리형
        // boolean(1byte)

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0);

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);

        // 참조형 : 메모리에 쓰이는 방법이 다름
        // 참조형 데이터의 값 -> 힙 메모리 영역
        // 변수에 대입되는 값 -> 힙 메모리 영역의 주소값
        String aa = new String("Hello!");
        System.out.println(aa);

        String bb = "Hello!!";
        String cc = "Hello!!";
        if (aa == bb) {
            System.out.println("aa==bb");
        }
        if (bb == cc) {
            System.out.println("bb==cc");
        }

        // 리터럴 방식으로 대입하면 기존 힙 메모리에 동일한 값이 있으면
        // 새롭게 만들지 않고 대입을 하고, new이면 무조건 새로 만든다.
        // 따라서 bb와 cc의 주소는 같다.

        // 상수: constants, final variables
        // 한 번 값이 할당하면 재할당 불가능
        // 보통 전체 대문자, 단어간 구분은 _ 사용
        final double PI = 3.14;
        System.out.println(PI);

        // 형 변환
        // byte < short < int < long <<<< float < double
        // 큰 것에 작은 것을 넣으면 자동 형변환됨
        // 작은 것을 큰것에 넣으면 강제 형변환
        int aaa = 128;
        short bbb = (short) aaa;

        // byte로 형변환하면 -128~127이 범위니까, 128이면 범위를 다시 돌아 -128 출력

        // 자동 형변환
        int m = 80;
        double n = m; // m이 double로 typecasting
        System.out.println(m);
        System.out.println(n);

        // 강제 형변환
        double c1 = 10.54646546;
        float d = (float) c1;
        System.out.println(c1);
        System.out.println(d);

        // 여러개의 형변환은 묶어주자.
        int e = 10;
        short f = 20;
        short g = (short) (e + f);
        System.out.println(g);

        // String : 문자열 객체
        // 객체 -> 힙 메모리 영역에 올라감
        // 변수 -> 힙 메모리 영역의 주소가 들어감
        String str = "안녕하세요"; // 문자열 리터럴
        String str_2 = new String("안녕하세요"); // 생성자
        String str_3 = "안녕하세요";

        // 객체 주소 비교
        if (str == str_2) {
            System.out.println("str == str_2");
        } else if (str == str_3) {
            System.out.println("str == str_3");
        } else if (str_2 == str_3) {
            System.out.println("str_2 == str_3");
        }

        // 문자열 내용이 같은지 비교
        if (str.equals(str_2)) {
            System.out.println("str.equals(str_2)");
        }
        if (str.equals(str_3)) {
            System.out.println("str.equals(str_3)");
        }
        if (str_2.equals(str_3)) {
            System.out.println("str_2.equals(str_3)");
        }

        // 문자열 병합
        // 1. + 사용 (메모리에 영향이 감)
        String str1 = "Hello";
        String str2 = " world";
        System.out.println(str1 + str2);

        // 2. StringBuilder (힙 메모리 사용하지 않기)
        StringBuilder strBdr = new StringBuilder("Hello");
        strBdr.append(" World!");
        // 속도가 빠르고, 메모리를 적게 사용
        System.out.println(strBdr.toString());

        String str_new = strBdr.toString();
        System.out.println(str_new);

        // 문자열 슬라이스
        String str3 = "이름: 김자바";
        System.out.println(str3.indexOf("이"));

        String str_name = str3.substring(4, 7);
        System.out.println(str_name);

        // 문자열 대소문자 반환
        String str4 = "abc";
        String str5 = "ABC";

        str4 = str4.toUpperCase(); // 소->대
        str5 = str5.toLowerCase(); // 대->소

        System.out.println(str4);
        System.out.println(str5);

        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("str4 == str5");
        }

        // 공백제거
        // 1. 양쪽 공백
        String str6 = "  양쪽끝공백있음   ";
        str6 = str6.trim();
        // 2. 문자열 중간 공백
        String str7 = "문자열 중    간 공백 있음";
        str7 = str7.replace(" ", "");

        System.out.println(str6);
        System.out.println(str7);

        // 콘솔 입출력, 개행 조정
        Scanner sc = new Scanner(System.in); // 입력장치 연결
        System.out.print("아이디를 입력해주세요 >>");
        String username = sc.nextLine();

        System.out.print("생년월일을 입력해주세요 >>");
        int birthDate = sc.nextInt();

        System.out.printf("%s\t%d", username, birthDate);

        // 연산자
        // 1.산술연산자 +-*/
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // 2. 비교연산자 > < >= <= == !=
        int num3 = 5;
        int num4 = 8;
        System.out.println(num3 > num4);

        // 3. 대입연산자 =
        // 4. 논리연산자 &&, ||, !
        System.out.println(num1 > num3 && num3 < num4);

    }

}
