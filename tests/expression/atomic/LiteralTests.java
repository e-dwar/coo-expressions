package expression.atomic;

import static org.junit.Assert.*;
import expression.atomic.Literal;

public class LiteralTests extends AtomicTests<Literal> {

    @Override
    public Literal createExpressionEquals10() {
        return new Literal(10);
    }

    @Override
    public void testPrint() {
        assertEquals("10", expressionEquals10.print(printer, env));
    }

}
