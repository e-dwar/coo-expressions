package visitor.printer;

import visitor.Visitor;
import environment.Environment;
import expression.atomic.Literal;
import expression.atomic.Variable;
import expression.conditional.If;

public abstract class Printer implements Visitor {

	protected String result;

	public String getResult() {
		return result;
	}

	@Override
	public void visitIf(If expression, Environment env) {
		result = "(";
		result += "if " + expression.getCondition().print(this, env);
		result += " then " + expression.getInstruction1().print(this, env);
		result += " else " + expression.getInstruction2().print(this, env);
		result += ")";
	}

	@Override
	public void visitLiteral(Literal expression, Environment env) {
		result = expression.getValue() + "";
	}

	@Override
	public void visitVariable(Variable expression, Environment env) {
		result = expression.getName();
	}
}
