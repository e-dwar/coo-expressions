package visitor.evaluator;

import visitor.Visitor;
import environment.Environment;
import expression.binary.BinaryExpression;
import expression.conditional.If;
import expression.atomic.*;

public class StandardEvaluator implements Visitor<Integer> {

    protected Environment env;

    public void setEnvironment(Environment env) {
        this.env = env;
    }

    public Integer visitLiteral(Literal expression) {
        return expression.getValue();
    }

    public Integer visitVariable(Variable expression) {
        return env.getValue(expression).getValue();
    }

    public Integer visitBinary(BinaryExpression expression) {
        int x = expression.getLeftOperand().eval(this, env);
        int y = expression.getRightOperand().eval(this, env);
        return expression.compute(x, y);
    }

    public Integer visitIf(If expression) {
        if (expression.getCondition().eval(this, env) == 1) {
            return expression.getInstruction1().eval(this, env);
        } else {
            return expression.getInstruction2().eval(this, env);
        }
    }
}
