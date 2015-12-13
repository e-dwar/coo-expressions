package expression.atomic;

import visitor.Visitor;

public class Literal extends AtomicExpression {

    protected int value;

    public Literal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLiteral(this);
    }
}
