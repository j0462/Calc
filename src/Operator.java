public class Operator {
    public static int addOperator(int a, int b) {
        return a + b;
    }

    public static int subtractOperator(int a, int b) {
        return a - b;
    }

    public static int multiplyOperator(int a, int b) {
        return a * b;
    }

    public static int divideOperator(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("분모가 0 입니다");
        }
    }

    public static int moduloOperator(int a, int b) { //클래스의 메소드 단일 책임화
        return a % b;
    }
}
