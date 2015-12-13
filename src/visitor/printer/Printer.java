package visitor.printer;

import visitor.Visitor;
import expression.atomic.Literal;
import expression.atomic.Variable;
import expression.conditional.If;

public abstract class Printer implements Visitor {

    protected String result;

    public String getResult() {
        return result;
    }

    @Override
    public void visitIf(If expression) {
        result = "(";
        result += "if " + expression.getCondition().print(this);
        result += " then " + expression.getInstruction1().print(this);
        result += " else " + expression.getInstruction2().print(this);
        result += ")";
    }

    @Override
    public void visitLiteral(Literal expression) {
        result = expression.getValue() + "";
    }

    @Override
    public void visitVariable(Variable expression) {
        result = expression.getName();
    }
}
