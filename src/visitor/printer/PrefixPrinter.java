package visitor.printer;

import expression.binary.*;

public class PrefixPrinter extends Printer {

	@Override
	public String visitPlus(Plus expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return expression.getSymbol() + " " + x + " " + y;
	}

	@Override
	public String visitMinus(Minus expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return expression.getSymbol() + " " + x + " " + y;
	}

	@Override
	public String visitMult(Mult expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return expression.getSymbol() + " " + x + " " + y;
	}

	@Override
	public String visitDiv(Div expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return expression.getSymbol() + " " + x + " " + y;
	}

	@Override
	public String visitEquality(Equality expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return expression.getSymbol() + " " + x + " " + y;
	}
}
