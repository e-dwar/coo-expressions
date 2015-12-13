package visitor.evaluator;

import expression.atomic.Variable;

public class BulletProofEvaluator extends StandardEvaluator {

    @Override
    public Integer visitVariable(Variable expression) {
        if (env.isBound(expression)) {
            return super.visitVariable(expression);
        } else {
            return 0;
        }
    }
}
