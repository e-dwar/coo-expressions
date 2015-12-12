package expression;

import org.junit.Test;
import environment.UnboundVariable;

public class VariableTests extends AtomicTests<Variable> {

	@Override
	public Variable createExpression() {
		return new Variable("x");
	}

	@Test
	public void testEval() throws UnboundVariable {
		environment.setValue(expression, new Literal(10));
		super.testEval();
	}

	@Test(expected=UnboundVariable.class)
	public void testEvalWithUnboundVariable() throws UnboundVariable {
		super.testEval();
	}
}
