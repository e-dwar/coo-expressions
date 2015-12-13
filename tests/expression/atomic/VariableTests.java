package expression.atomic;

import org.junit.Test;
import static org.junit.Assert.*;
import environment.UnboundVariableException;
import expression.atomic.Literal;
import expression.atomic.Variable;

public class VariableTests extends AtomicTests<Variable> {

	@Override
	public Variable createExpressionEquals10() {
		return new Variable("x");
	}

	@Override
	public void testEvalEquals10() {
		env.setValue(expressionEquals10, new Literal(10));
		super.testEvalEquals10();
	}

	@Test(expected = UnboundVariableException.class)
	public void testEvalWithUnboundVariable() {
		super.testEvalEquals10();
	}

	@Override
	public void testPrint() {
		assertEquals("x", expressionEquals10.print(printer, env));
	}
}
