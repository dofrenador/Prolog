import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        System.out.println(value);   
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }

    /** INT */
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0;
    }
    /**expr op '^' expr */
    @Override
    public Integer visitPow(LabeledExprParser.PowContext ctx){
        Integer left = visit(ctx.expr(0));  // get value of left subexpression
        Integer right = visit(ctx.expr(1)); // get value of right subexpression
        return  (int)(Math.pow(left,right));
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMul(LabeledExprParser.MulContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left * right;
    }
    @Override
    public Integer visitDiv(LabeledExprParser.DivContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left / right;
    }


    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitSub(LabeledExprParser.SubContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left - right; // must be SUB
    }
    @Override
    public Integer visitAdd(LabeledExprParser.AddContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left + right; // must be SUB
    }
    @Override/** expr op= '%' expr */
    public Integer visitModulo(LabeledExprParser.ModuloContext ctx){
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left % right;
    }
    /** increment */
    @Override
    public Integer visitIncrement(LabeledExprParser.IncrementContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            memory.put(id, memory.get(id)+1);
        }
        else{
            memory.put(id, 1);
        }
        return memory.get(id);
    }
    /** sin */
    @Override
    public Integer visitSin(LabeledExprParser.SinContext ctx)
    {
        int value = this.visit(ctx.expr());
        return (int)Math.cos(value);
    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}