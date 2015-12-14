package visitor.printer;

import visitor.Visitor;
import expression.atomic.Literal;
import expression.atomic.Variable;
import expression.binary.*;
import expression.conditional.If;

public abstract class Printer implements Visitor<String> {

	public abstract String visitPlus(Plus expression);

	public abstract String visitMinus(Minus expression);

	public abstract String visitMult(Mult expression);

	public abstract String visitDiv(Div expression);

	public abstract String visitEquality(Equality expression);

	public String visitLiteral(Literal expression) {
		return expression.getValue() + "";
	}

	public String visitVariable(Variable expression) {
		return expression.getName();
	}

	public String visitIf(If expression) {
		String result = "(";
		result += "if " + expression.getCondition().accept(this);
		result += " then " + expression.getInstruction1().accept(this);
		result += " else " + expression.getInstruction2().accept(this);
		result += ")";
		return result;
	}
}
