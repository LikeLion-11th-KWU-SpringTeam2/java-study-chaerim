// Chapter5 - 자바 변수와 자료형

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
        // 1. double(8bytes) - 소수점 이하 15자리까지 정밀도
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

    }
}
