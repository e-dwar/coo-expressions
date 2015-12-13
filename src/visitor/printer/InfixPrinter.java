package visitor.printer;

import expression.binary.BinaryExpression;

public class InfixPrinter extends Printer {

    @Override
    public String visitBinary(BinaryExpression expression) {
        String x = expression.getLeftOperand().print(this);
        String y = expression.getRightOperand().print(this);
        return "(" + x + " " + expression.getSymbol() + " " + y + ")";
    }
}
