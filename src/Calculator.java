import java.util.ArrayList;
import java.util.List;

public class Calculator {
    static List<Integer> resultArray  = new ArrayList<>();
    public int Calc(int a, int b, char c){
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
                        throw new ArithmeticException("분모가 0 입니다");
                    }
                } catch (ArithmeticException e){
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
        return result;
    }
    public static void AddArray(int a){ //결과를 저장하는 메소드
        resultArray.add(a);
    }
    public static void RemoveArray(){ //결과 앞부분 삭제 메소드
        resultArray.removeFirst(); //remove(0) 대신 사용
    }
}
