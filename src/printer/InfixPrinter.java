package printer;

import expression.*;

public class InfixPrinter extends Printer {

	public String visit(Binary expression) {
		String x = expression.getOperand(1).print(this);
		String y = expression.getOperand(2).print(this);
		return "(" + x + " " + expression.getSymbol() + " " + y + ")";
	}
}
