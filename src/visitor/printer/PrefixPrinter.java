package visitor.printer;

import expression.binary.BinaryExpression;

public class PrefixPrinter extends Printer {

    @Override
    public String visitBinary(BinaryExpression expression) {
        String x = expression.getLeftOperand().print(this);
        String y = expression.getRightOperand().print(this);
        return expression.getSymbol() + " " + x + " " + y;
    }
}
