import java.util.Scanner; //스캐너 라이브러리


public class App {

    public static <T> void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성

        System.out.print("산수 : m | 원넓이 : c 를 입력해주세요: "); // 산수, 원넓이 선택
        Calculator calculator = new Calculator(sc); //클래스 생성자

        if(calculator.Getmode().equals("circle")){
            CircleCalculator calculators = new CircleCalculator();
            while (true){
                System.out.print("반지름을 입력해주세요: ");
                double a = sc.nextDouble(); //반지름 인수
                double result = 0;
                try{
                    if(a>=0) {
                        result = calculators.calculateCircleArea(a);
                    }else{
                        throw new Exception("반지름이 마이너스");
                    }
                }catch (Exception e){
                    System.out.println("반지름이 음수가 될 수 없습니다");
                }

                System.out.println("결과 : "+result);

                calculators.CRemoveArray(sc); //삭제 메소드

                calculators.CInquiryArray(sc); //조회 메소드

                System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)"); //종료 트리거
                String q = sc.next();
                if("exit".equals(q)) {
                    break; //탈출
                }
            }
        } else if(calculator.Getmode().equals("math")){ //산수기능
            ArithmeticCalculator<Double> calculators = new ArithmeticCalculator();
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double a = sc.nextDouble(); //첫 번째 인수

                System.out.print("두 번째 숫자를 입력하세요: ");
                double b = sc.nextDouble(); //두 번째 인수

                double result = 0;

                System.out.print("사칙연산 기호를 입력하세요: ");
                char c = sc.next().charAt(0); //사칙연산 기호
                Operator op = Operator.fromSymbol(c);


                result = calculators.Calc(a,b,op);
                if(c=='/'&&b==0) {
                    System.out.println("결과 : ERROR");
                }else {
                    System.out.println("결과 : " + result);
                }


                calculators.RemoveArray(sc); //삭제 메소드

                calculators.InquiryArray(sc); //조회 메소드

                calculators.GreaterThanInput(a, b, sc); //람다 스트림 활용

                System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)"); //종료 트리거
                String q = sc.next();
                if("exit".equals(q)) {
                    break; //탈출
                }
            }
        }
        sc.close(); //스캐너 종료 컴파일 오류 예방
    }
}