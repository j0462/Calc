public class Operate<T extends Number> {
    public static <T extends Number> T addOperator(T a, T b) {
        return (T) (Number) (a.doubleValue() + b.doubleValue());
    }

    public static <T extends Number> T subtractOperator(T a, T b) {
        return (T) (Number) (a.doubleValue() - b.doubleValue());
    }

    public static <T extends Number> T multiplyOperator(T a, T b) {
        return (T) (Number) (a.doubleValue() * b.doubleValue());
    }

    public static <T extends Number> T divideOperator(T a, T b) {
        if (!b.equals(0)) {
            return (T) (Number) (a.doubleValue() / b.doubleValue());
        } else {
            throw new ArithmeticException("분모가 0 입니다");
        }
    }

    public static <T extends Number> T moduloOperator(T a, T b) { //클래스의 메소드 단일 책임화
        return (T) (Number) (a.doubleValue() % b.doubleValue());
    }
}
