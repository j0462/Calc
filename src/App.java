import java.io.Console;
import java.util.Scanner; //스캐너 라이브러리

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in); //스캐너 생성

            System.out.print("첫 번째 숫자(양수)를 입력하세요: ");
            int a = sc.nextInt(); //첫 번째 인수

            System.out.print("두 번째 숫자(양수)를 입력하세요: ");
            int b = sc.nextInt(); //두 번째 인수

            int result = 0;

            if (a >= 0 && b >= 0) { //두 인수의 음수 판별
                System.out.print("사칙연산 기호를 입력하세요: ");
                char c = sc.next().charAt(0); //사칙연산 기호

                switch (c) {
                    case '+':
                        result = a + b; //더하기
                        System.out.println("결과: " + result);
                        break;
                    case '-':
                        result = a - b; //빼기
                        System.out.println("결과: " + result);
                        break;
                    case '*':
                        result = a * b; //곱하기
                        System.out.println("결과: " + result);
                        break;
                    case '/':
                        if (b == 0) { //분모 확인
                            System.out.println("나눗셈 연산의 분모는 0이 될 수 없습니다");
                            return;
                        }
                        result = a / b; //몫
                        System.out.println("결과: " + result);
                        break;
                    case '%':
                        result = a % b; //나머지
                        System.out.println("결과: " + result);
                        break;
                    default:
                        System.out.println("사칙연산 기호가 아닙니다");
                }
            } else {
                System.out.println("입력하신 숫자 중 음수가 있습니다");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)"); //종료 트리거
            String q = sc.next();
            if(q.equals("exit")) {
                sc.close(); //스캐너 종료 컴파일 오류 예방
                break; //탈출
            }
        }
    }
}