package evaluator;

import environment.Environment;
import environment.UnboundVariable;
import expression.binary.Binary;
import expression.binary.Plus;
import expression.conditional.If;
import expression.atomic.*;

public class Standard {
	
	public int visit(Literal expression, Environment env) {
		return expression.getValue();
	}
	
	public int visit(Variable expression, Environment env) throws UnboundVariable {
		return env.getValue(expression).getValue();
	}

	public int visit(Binary expression, Environment env) throws UnboundVariable {
		int x = expression.getOperand(1).eval(this, env);
                System.out.println("visit(Binary)");
		int y = expression.getOperand(2).eval(this, env);
		return expression.compute(x, y);
	}
	
public int visit(Plus expression, Environment env) throws UnboundVariable {
  System.out.println("visit(Plus)");
  int x = expression.getOperand(1).eval(this, env);
  int y = expression.getOperand(2).eval(this, env);
  return x + y;
}

	public int visit(If expression, Environment env) throws UnboundVariable {
		if (expression.getCondition().eval(this, env) == 1) {
			return expression.getInstruction(1).eval(this, env);			
		} else {
			return expression.getInstruction(2).eval(this, env);
		}
	}
}
