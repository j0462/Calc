public class EnumClass {
    public enum Operator {
        PLUS('+'),
        MINUS('-'),
        MULTIPLY('*'),
        DIVIDE('/'),
        MODULO('%');

        final char symbol;

        Operator(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }

        public static Operator fromSymbol(char symbol) {
            for (Operator op : Operator.values()) {
                if (op.getSymbol() == symbol) {
                    return op;
                }
            }
            throw new IllegalArgumentException("없는 기호입니다: " + symbol);
        }
    }
}
