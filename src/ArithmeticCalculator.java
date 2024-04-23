import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticCalculator {
    List<Integer> resultArray; //public 생략시 private

    public ArithmeticCalculator() {
        resultArray = new ArrayList<Integer>();
    }

    public int Calc(int a, int b, EnumClass.Operator c){ //계산
        int result = 0;
        switch (c) {
            case EnumClass.Operator.PLUS:
                result = Operator.addOperator(a,b);
                break;
            case EnumClass.Operator.MINUS:
                result = Operator.subtractOperator(a,b); //빼기
                break;
            case EnumClass.Operator.MULTIPLY:
                result = Operator.multiplyOperator(a,b); //곱하기
                break;
            case EnumClass.Operator.DIVIDE:
                try {
                    if (b != 0) {
                        result = Operator.divideOperator(a,b);;
                    } else {
                        throw new ArithmeticException("분모가 0 입니다"); //오류 던짐
                    }
                } catch (ArithmeticException e){ //오류 잡음
                    System.out.println("나눗셈 연산의 분모는 0이 될 수 없습니다");
                    return 0;
                }
                break;
            case EnumClass.Operator.MODULO:
                result= Operator.moduloOperator(a,b);; //나머지
                break;
        }
        AddArray(result);
        return result; //반환값
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
