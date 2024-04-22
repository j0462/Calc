import java.util.Scanner; //스캐너 라이브러리

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt(); //첫 번째 인수

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt(); //두 번째 인수

        System.out.print("사칙연산 기호를 입력하세요: ");
        char c = sc.next().charAt(0); //사칙연산 기호

        sc.close(); //스캐너 종료 컴파일 오류 예방
    }
}