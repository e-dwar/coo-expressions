package printer;

import expression.Binary;

public class PrefixPrinter extends Printer {

	public String visit(Binary expression) {
		String x = expression.getOperand(1).print(this);
		String y = expression.getOperand(2).print(this);
		return expression.getSymbol() + " " + x + " " + y;
	}
}
