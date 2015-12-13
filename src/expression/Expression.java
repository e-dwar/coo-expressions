package expression;

import visitor.Visitor;
import visitor.printer.Printer;
import visitor.evaluator.StandardEvaluator;
import environment.Environment;

public abstract class Expression {

    public abstract <T> T accept(Visitor<T> visitor);

    public String print(Printer printer) {
        return accept(printer);
    }

    public int eval(StandardEvaluator evaluator, Environment env) {
        evaluator.setEnvironment(env);
        return accept(evaluator);
    }
}
