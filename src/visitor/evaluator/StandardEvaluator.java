package visitor.evaluator;

import visitor.Visitor;
import environment.Environment;
import expression.binary.BinaryExpression;
import expression.conditional.If;
import expression.atomic.*;

public class StandardEvaluator implements Visitor {

    protected int result;
    protected Environment env;

    public int getResult() {
        return result;
    }

    public void setEnvironment(Environment env) {
        this.env = env;
    }

    @Override
    public void visitLiteral(Literal expression) {
        result = expression.getValue();
    }

    @Override
    public void visitVariable(Variable expression) {
        result = env.getValue(expression).getValue();
    }

    @Override
    public void visitBinary(BinaryExpression expression) {
        int x = expression.getLeftOperand().eval(this, env);
        int y = expression.getRightOperand().eval(this, env);
        result = expression.compute(x, y);
    }

    @Override
    public void visitIf(If expression) {
        if (expression.getCondition().eval(this, env) == 1) {
            result = expression.getInstruction1().eval(this, env);
        } else {
            result = expression.getInstruction2().eval(this, env);
        }
    }
}
