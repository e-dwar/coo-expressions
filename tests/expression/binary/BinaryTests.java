package expression.binary;

import static org.junit.Assert.*;
import expression.ExpressionTests;
import expression.binary.BinaryExpression;

public abstract class BinaryTests<E extends BinaryExpression> extends ExpressionTests<E> {

    @Override
    public void testPrint() {
        String x, y, symbol, expected, actual;
        symbol = expressionEquals10.getSymbol();
        x = expressionEquals10.getLeftOperand().print(printer);
        y = expressionEquals10.getRightOperand().print(printer);
        expected = "(" + x + " " + symbol + " " + y + ")";
        actual = expressionEquals10.print(printer);
        assertEquals(expected, actual);
    }
}
