import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner; //스캐너 라이브러리
import java.util.List; //리스트 라이브러리

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

                Calculator calculator = new Calculator();
                result = calculator.Calc(a,b,c);
                if(c=='/' && b==0)
                {
                    System.out.println("결과 : ERROR");
                }else {
                    System.out.println("결과 : "+result);
                }
            } else {
                System.out.println("입력하신 숫자 중 음수가 있습니다");
            }

            Calculator calculator = new Calculator(); //클래스 생성자

            calculator.RemoveArray(sc); //삭제 메소드

            calculator.InquiryArray(sc); //조회 메소드

            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)"); //종료 트리거
            String q = sc.next();
            if(q.equals("exit")) {
                sc.close(); //스캐너 종료 컴파일 오류 예방
                break; //탈출
            }
        }
    }
}