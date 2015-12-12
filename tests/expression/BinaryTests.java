package expression;

import static org.junit.Assert.*;
import printer.InfixPrinter;

public abstract class BinaryTests<E extends Binary> extends ExpressionTests<E> {

	@Override
	public void testPrint() {
		String x, y, symbol, expected, actual;
		InfixPrinter printer = new InfixPrinter();
		symbol = expressionEquals10.symbol;
		x = expressionEquals10.getOperand(1).print(printer);
		y = expressionEquals10.getOperand(2).print(printer);
		expected = "(" + x + " " + symbol + " " + y + ")";
		actual = expressionEquals10.print(printer);
		assertEquals(expected, actual);
	}
}
