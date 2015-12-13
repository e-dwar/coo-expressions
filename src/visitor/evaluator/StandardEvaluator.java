package visitor.evaluator;

import visitor.Visitor;
import environment.Environment;
import expression.binary.BinaryExpression;
import expression.conditional.If;
import expression.atomic.*;

public class StandardEvaluator implements Visitor {

    protected int result;

    public int getResult() {
        return result;
    }

    @Override
    public void visitLiteral(Literal expression, Environment env) {
        result = expression.getValue();
    }

    @Override
    public void visitVariable(Variable expression, Environment env) {
        result = env.getValue(expression).getValue();
    }

    @Override
    public void visitBinary(BinaryExpression expression, Environment env) {
        int x = expression.getLeftOperand().eval(this, env);
        int y = expression.getRightOperand().eval(this, env);
        result = expression.compute(x, y);
    }

    @Override
    public void visitIf(If expression, Environment env) {
        if (expression.getCondition().eval(this, env) == 1) {
            result = expression.getInstruction1().eval(this, env);
        } else {
            result = expression.getInstruction2().eval(this, env);
        }
    }
}
