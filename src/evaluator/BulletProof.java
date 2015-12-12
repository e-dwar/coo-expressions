package evaluator;

import environment.Environment;
import environment.UnboundVariable;
import expression.atomic.Variable;

public class BulletProof extends Standard {
	
	public int visit(Variable expression, Environment env) {
		try {
			return super.visit(expression, env);
		} catch (UnboundVariable e) {
			return 0;
		}
	}
}
