package visitor.evaluator;

import expression.atomic.Variable;

public class BulletProofEvaluator extends StandardEvaluator {

    @Override
    public void visitVariable(Variable expression) {
        if (env.isBound(expression)) {
            super.visitVariable(expression);
        } else {
            result = 0;
        }
    }
}
