package expression.atomic;

import visitor.Visitor;

public class Variable extends AtomicExpression {

    protected String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVariable(this);
    }
}
