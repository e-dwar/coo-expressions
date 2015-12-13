package visitor.printer;

import visitor.Visitor;
import expression.atomic.Literal;
import expression.atomic.Variable;
import expression.conditional.If;

public abstract class Printer implements Visitor<String> {

    @Override
    public String visitLiteral(Literal expression) {
        return expression.getValue() + "";
    }

    @Override
    public String visitVariable(Variable expression) {
        return expression.getName();
    }

    @Override
    public String visitIf(If expression) {
        String result = "(";
        result += "if " + expression.getCondition().print(this);
        result += " then " + expression.getInstruction1().print(this);
        result += " else " + expression.getInstruction2().print(this);
        result += ")";
        return result;
    }
}
