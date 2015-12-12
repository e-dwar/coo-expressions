package printer;

import expression.Atomic;
import expression.Binary;

public abstract class Printer {

	public abstract String visit(Binary expression);
	
	public String visit(Atomic expression) {
		return expression.toString();
	}
}
