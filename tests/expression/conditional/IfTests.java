package expression.conditional;

import static org.junit.Assert.assertEquals;
import expression.ExpressionTests;
import expression.atomic.Literal;

public class IfTests extends ExpressionTests<If> {

	@Override
	public If createExpressionEquals10() {
		Literal zero = new Literal(0);
		Literal ten = new Literal(10);
		return new If(zero, zero, ten);
	}

	@Override
	public void testPrint() {
		String actual, expected = "";
		String condition, instruction1, instruction2;
		condition = expressionEquals10.getCondition().print(printer);
		instruction1 = expressionEquals10.getInstruction(1).print(printer);
		instruction2 = expressionEquals10.getInstruction(2).print(printer);
		expected += "if " + condition;
		expected += " then " + instruction1;
		expected += " else " + instruction2;
		expected = "(" + expected + ")";
		actual = expressionEquals10.print(printer);
		assertEquals(expected, actual);
	}

}
