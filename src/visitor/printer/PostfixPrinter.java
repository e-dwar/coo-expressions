package visitor.printer;

import expression.binary.BinaryExpression;

public class PostfixPrinter extends Printer {

    @Override
    public void visitBinary(BinaryExpression expression) {
        String x = expression.getLeftOperand().print(this);
        String y = expression.getRightOperand().print(this);
        result = x + " " + y + " " + expression.getSymbol();
    }
}
