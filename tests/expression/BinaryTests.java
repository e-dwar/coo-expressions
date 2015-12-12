package expression;

import static org.junit.Assert.*;

public abstract class BinaryTests<E extends Binary> extends ExpressionTests<E> {

	@Override
	public void testPrint() {
		String x, y, symbol, expected, actual;
		symbol = expressionEquals10.symbol;
		x = expressionEquals10.operand1.print();
		y = expressionEquals10.operand2.print();
		expected = "(" + x + symbol + y + ")";
		actual = expressionEquals10.print();
		assertEquals(expected, actual);
	}
}
