package expression.binary;

import expression.atomic.Literal;
import expression.binary.Div;

public class DivTests extends BinaryTests<Div> {

    @Override
    public Div createExpressionEquals10() {
        Literal two = new Literal(2);
        Literal twenty = new Literal(20);
        return new Div(twenty, two);
    }
}
