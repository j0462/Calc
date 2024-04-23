import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //스캐너 라이브러리

public class Calculator {
    List<Integer> resultArray; //public 생략시 private
    static final double PI = 3.141592; //접근제한이 필요없기에 static, 파이는 고정값이라 덮어쓸 일이 없기에 final이 붙는다
    List<Double> circleResult; //원 넓이 저장
    String mode;

    public Calculator(Scanner sc) { //생성자 초기화
        char c = sc.next().charAt(0);
        if(c == 'm'){
            resultArray = new ArrayList<>();
            mode = "math";
        }else if(c == 'c'){
            circleResult = new ArrayList<>();
            mode = "circle";
        }
    }

    public String Getmode() {
        return mode;
    }

    public double calculateCircleArea(double r) {
        double area = r*r*PI;
        CAddArray(area);
        return area;
    }

    public int Calc(int a, int b, char c){ //계산
        int result = 0;
        switch (c) {
            case '+':
                result = a + b; //더하기
                AddArray(result);
                break;
            case '-':
                result = a - b; //빼기
                AddArray(result);
                break;
            case '*':
                result = a * b; //곱하기
                AddArray(result);
                break;
            case '/':
                try {
                    if (b != 0) {
                        result = a / b;
                        AddArray(result);
                    } else {
                        throw new ArithmeticException("분모가 0 입니다"); //오류 던짐
                    }
                } catch (ArithmeticException e){ //오류 잡음
                    System.out.println("나눗셈 연산의 분모는 0이 될 수 없습니다");
                    return 0;
                }
                break;
            case '%':
                result= a % b; //나머지
                AddArray(result);
                break;
            default:
                System.out.println("사칙연산 기호가 아닙니다");
                return 0;
        }
        return result; //반환값
    }
    public void CAddArray(double a){ //원넓이 결과를 저장하는 메소드
        circleResult.add(a);
    }
    public void CRemoveArray(Scanner sc){ //원넓이 결과를 삭제하는 메소드 setter
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String r = sc.next();
        if(r.equals("remove")) {
            circleResult.removeFirst();
        }
    }
    public void CInquiryArray(Scanner sc){ //원넓이 결과를 조회하는 메소드 getter
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String i = sc.next();
        if(i.equals("inquiry")) {
            for(double unit : circleResult) {  //향상된 for문
                System.out.print(unit + " ");
            }
        }
    }
    public void AddArray(int a){ //결과를 저장하는 메소드
        resultArray.add(a);
    }
    public void RemoveArray(Scanner sc){ //결과를 삭제하는 메소드
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String r = sc.next();
        if(r.equals("remove")) {
            resultArray.removeFirst();
        }
    }
    public void InquiryArray(Scanner sc){ //결과를 조회하는 메소드
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String i = sc.next();
        if(i.equals("inquiry")) {
            for(int unit : resultArray) {  //향상된 for문
                System.out.print(unit + " ");
            }
        }
    }
}
