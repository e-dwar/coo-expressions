package visitor.evaluator;

import visitor.Visitor;
import environment.Environment;
import expression.binary.*;
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

	public Integer visitPlus(Plus expression) {
		int x = expression.getLeftOperand().accept(this);
		int y = expression.getRightOperand().accept(this);
		return x + y;
	}

	public Integer visitMinus(Minus expression) {
		int x = expression.getLeftOperand().accept(this);
		int y = expression.getRightOperand().accept(this);
		return x - y;
	}

	public Integer visitMult(Mult expression) {
		int x = expression.getLeftOperand().accept(this);
		int y = expression.getRightOperand().accept(this);
		return x * y;
	}

	public Integer visitDiv(Div expression) {
		int x = expression.getLeftOperand().accept(this);
		int y = expression.getRightOperand().accept(this);
		return x / y;
	}

	public Integer visitEquality(Equality expression) {
		int x = expression.getLeftOperand().accept(this);
		int y = expression.getRightOperand().accept(this);
		return x == y ? 1 : 0;
	}

	public Integer visitIf(If expression) {
		if (expression.getCondition().accept(this) == 1) {
			return expression.getInstruction1().accept(this);
		} else {
			return expression.getInstruction2().accept(this);
		}
	}
}
