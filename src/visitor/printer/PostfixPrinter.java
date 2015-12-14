package visitor.printer;

import expression.binary.*;

public class PostfixPrinter extends Printer {

	@Override
	public String visitPlus(Plus expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return x + " " + y + " " + expression.getSymbol();
	}

	@Override
	public String visitMinus(Minus expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return x + " " + y + " " + expression.getSymbol();
	}

	@Override
	public String visitMult(Mult expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return x + " " + y + " " + expression.getSymbol();
	}

	@Override
	public String visitDiv(Div expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return x + " " + y + " " + expression.getSymbol();
	}

	@Override
	public String visitEquality(Equality expression) {
		String x = expression.getLeftOperand().accept(this);
		String y = expression.getRightOperand().accept(this);
		return x + " " + y + " " + expression.getSymbol();
	}
}
