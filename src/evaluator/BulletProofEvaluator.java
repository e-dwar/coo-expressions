package evaluator;

import environment.Environment;
import environment.UnboundVariable;
import expression.Variable;

public class BulletProofEvaluator extends Evaluator {
	
	public int visit(Variable expression, Environment env) {
		try {
			return super.visit(expression, env);
		} catch (UnboundVariable e) {
			return 0;
		}
	}
}
