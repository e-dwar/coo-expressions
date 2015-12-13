package expression.binary;

import visitor.Visitor;
import environment.Environment;
import expression.Expression;

public abstract class BinaryExpression extends Expression {

    protected String symbol;
    protected Expression leftOperand;
    protected Expression rightOperand;

    public abstract int compute(int x, int y);

    public BinaryExpression(Expression leftOperand, Expression rightOperand, String symbol) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.symbol = symbol;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public void accept(Visitor visitor, Environment env) {
        visitor.visitBinary(this, env);
    }
}
