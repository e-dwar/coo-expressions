package expression;

import visitor.Visitor;
import visitor.printer.Printer;
import visitor.evaluator.StandardEvaluator;
import environment.Environment;

public abstract class Expression {

	public abstract void accept(Visitor visitor, Environment env);

	public String print(Printer printer, Environment env) {
		accept(printer, env);
		return printer.getResult();
	}

	public int eval(StandardEvaluator evaluator, Environment env) {
		accept(evaluator, env);
		return evaluator.getResult();
	}
}
