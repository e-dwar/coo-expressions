package visitor.evaluator;

import environment.Environment;
import expression.atomic.Variable;

public class BulletProofEvaluator extends StandardEvaluator {

    @Override
    public void visitVariable(Variable expression, Environment env) {
        if (env.isBound(expression)) {
            super.visitVariable(expression, env);
        } else {
            result = 0;
        }
    }
}
