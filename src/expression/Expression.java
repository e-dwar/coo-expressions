package expression;

import visitor.Visitor;
import visitor.printer.Printer;
import visitor.evaluator.StandardEvaluator;
import environment.Environment;

public abstract class Expression {

    public abstract void accept(Visitor visitor);

    public String print(Printer printer) {
        accept(printer);
        return printer.getResult();
    }

    public int eval(StandardEvaluator evaluator, Environment env) {
        evaluator.setEnvironment(env);
        accept(evaluator);
        return evaluator.getResult();
    }
}
