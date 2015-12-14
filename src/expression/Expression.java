package expression;

import visitor.Visitor;
import visitor.evaluator.StandardEvaluator;
import visitor.printer.Printer;

public abstract class Expression {

	public abstract <T> T accept(Visitor<T> visitor);
	
	public int eval(StandardEvaluator evaluator) {
		return this.accept(evaluator);
	}
	
	public String print(Printer printer) {
		return this.accept(printer);
	}
}
