package expression;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import environment.Environment;
import environment.UnboundVariable;
import static org.junit.Assert.*;

public abstract class ExpressionTests<E extends Expression> {

	protected E expressionEquals10;
	protected Environment environment;

	public abstract E createExpressionEquals10();

	@Before
	public void setUp() {
		environment = new Environment();
		expressionEquals10 = createExpressionEquals10();
	}

	@After
	public void tearDown() {
		environment = null;
		expressionEquals10 = null;
	}

	@Test
	public abstract void testPrint();

	@Test
	public void testEvalEquals10() throws UnboundVariable {
		assertTrue(10 == expressionEquals10.eval(environment));
	}
}
