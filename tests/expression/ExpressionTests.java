package expression;

import org.junit.After;
import org.junit.Before;
import environment.Environment;
import environment.UnboundVariable;
import static org.junit.Assert.*;

public abstract class ExpressionTests<E extends Expression> {

	protected E expression;
	protected Environment environment;

	public abstract E createExpression();

	@Before
	public void setUp() {
		environment = new Environment();
		expression = createExpression();
	}

	public void testEval() throws UnboundVariable {
		assertTrue(10 == expression.eval(environment));
	}

	@After
	public void tearDown() {
		environment = null;
		expression = null;
	}
}
