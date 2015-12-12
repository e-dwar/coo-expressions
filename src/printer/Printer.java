package printer;

import expression.atomic.Atomic;
import expression.binary.Binary;
import expression.conditional.If;

public abstract class Printer {

	public abstract String visit(Binary expression);

	public String visit(Atomic expression) {
		return expression.toString();
	}
	
	public String visit(If expression) {
		String s = "(";
		s += "if " + expression.getCondition().print(this);
		s += " then " + expression.getInstruction(1);
		s += " else " + expression.getInstruction(2);
		return s + ")";
	}
}
