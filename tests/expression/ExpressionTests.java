package expression;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import environment.Environment;
import environment.UnboundVariable;
import evaluator.Evaluator;
import static org.junit.Assert.*;

public abstract class ExpressionTests<E extends Expression> {

	protected E expressionEquals10;
	protected Environment env;

	public abstract E createExpressionEquals10();

	@Before
	public void setUp() {
		env = new Environment();
		expressionEquals10 = createExpressionEquals10();
	}

	@After
	public void tearDown() {
		env = null;
		expressionEquals10 = null;
	}

	@Test
	public abstract void testPrint();

	@Test
	public void testEvalEquals10() throws UnboundVariable {
		assertTrue(10 == expressionEquals10.eval(new Evaluator(), env));
	}
}
