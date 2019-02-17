import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Double> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Double> memory = new HashMap<String, Double>();

    /** ID '=' expr NEWLINE */
    @Override
    public Double visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        Double value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        System.out.println(value);   
        return value;
    }
    /** ID '+=' expr NEWLINE */
    @Override
    public Double visitAssignPlus(LabeledExprParser.AssignPlusContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        Double value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value + memory.get(ctx.ID().getText()));           // store it in our memory
        System.out.println(memory.get(id));
        //System.out.println(value);   
        return value;
    }

     /** ID '-=' expr NEWLINE */
     @Override
     public Double visitAssignMinus(LabeledExprParser.AssignMinusContext ctx) {
         String id = ctx.ID().getText();  // id is left-hand side of '='
         Double value = visit(ctx.expr());   // compute value of expression on right
         memory.put(id, memory.get(ctx.ID().getText())- value);           // store it in our memory
         System.out.println(memory.get(id));
         //System.out.println(value);   
         return value;
     }

      /** ID '-=' expr NEWLINE */
      @Override
      public Double visitAssignMultiply(LabeledExprParser.AssignMultiplyContext ctx) {
          String id = ctx.ID().getText();  // id is left-hand side of '='
          Double value = visit(ctx.expr());   // compute value of expression on right
          memory.put(id, memory.get(ctx.ID().getText())*value);           // store it in our memory
          System.out.println(memory.get(id));
          //System.out.println(value);   
          return value;
      }

      @Override
      public Double visitAssignDivide(LabeledExprParser.AssignDivideContext ctx) {
          String id = ctx.ID().getText();  // id is left-hand side of '='
          Double value = visit(ctx.expr());   // compute value of expression on right
          memory.put(id, memory.get(ctx.ID().getText())/value);           // store it in our memory
          System.out.println(memory.get(id));
          //System.out.println(value);   
          return value;
      }
     
    

    /** expr NEWLINE */
    @Override
    public Double visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0.0;                          // return dummy value
    }

    /** INT */
    @Override
    public Double visitInt(LabeledExprParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    /** Double */
    public Double visitDouble(LabeledExprParser.DoubleContext ctx) {
        return Double.valueOf(ctx.DOUBLE().getText());
    }

    /** ID */
    @Override
    public Double visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0.0;
    }
    /**expr op '^' expr */
    @Override
    public Double visitPow(LabeledExprParser.PowContext ctx){
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return  (Math.pow(left,right));
    }

    /**NEGATE */
    @Override
    public Double visitNegate(LabeledExprParser.NegateContext ctx){
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return 0.0 - memory.get(id);
        return 0.0;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Double visitMul(LabeledExprParser.MulContext ctx) {
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return left * right;
    }
    @Override
    public Double visitDiv(LabeledExprParser.DivContext ctx) {
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return left / right;
    }

    /**NOT*/
    @Override
    public Double visitNot(LabeledExprParser.NotContext ctx) {
        Double value = this.visit(ctx.expr());
        if(value == 0)
        return 1.0;
        else 
        return 0.0;
    }
    /**AndAnd */
    @Override
    public Double visitAndAnd(LabeledExprParser.AndAndContext ctx){
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if(left == 0.0 || right == 0.0)   
        return 0.0;
        else 
        return 1.0;
    }

     /**OrOr */
     @Override
     public Double visitOrOr(LabeledExprParser.OrOrContext ctx){
         Double left = visit(ctx.expr(0));
         Double right = visit(ctx.expr(1));
         if(left == 0.0 && right == 0.0)   
         return 0.0;
         else 
         return 1.0;
     }


    /** expr op=('+'|'-') expr */
    @Override
    public Double visitSub(LabeledExprParser.SubContext ctx) {
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return left - right; // must be SUB
    }
    @Override
    public Double visitAdd(LabeledExprParser.AddContext ctx) {
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return left + right; // must be SUB
    }
    @Override/** expr op= '%' expr */
    public Double visitModulo(LabeledExprParser.ModuloContext ctx){
        Double left = visit(ctx.expr(0));  // get value of left subexpression
        Double right = visit(ctx.expr(1)); // get value of right subexpression
        return left % right;
    }
    /** increment */
    @Override
    public Double visitIncrementRight(LabeledExprParser.IncrementRightContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            memory.put(id, memory.get(id)+1.0);
        }
        else{
            memory.put(id, 1.0);
        }
        return memory.get(id);
    }
    @Override
    public Double visitIncrementLeft(LabeledExprParser.IncrementLeftContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            memory.put(id, memory.get(id)+1.0);
        }
        else{
            memory.put(id, 1.0);
        }
        return memory.get(id);
    }
    @Override
    public Double visitDecrementLeft(LabeledExprParser.DecrementLeftContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            memory.put(id, memory.get(id)-1.0);
        }
        else{
            memory.put(id, -1.0);
        }
        return memory.get(id);
    }
    @Override
    public Double visitDecrementRight(LabeledExprParser.DecrementRightContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            memory.put(id, memory.get(id)-1.0);
        }
        else{
            memory.put(id, -1.0);
        }
        return memory.get(id);
    }

    /** sin */
    @Override
    public Double visitSin(LabeledExprParser.SinContext ctx)
    {
        Double value = this.visit(ctx.expr());
        return Math.sin(value);
    }

    /** cos */
    @Override
    public Double visitCos(LabeledExprParser.CosContext ctx)
    {
        Double value = this.visit(ctx.expr());
        return Math.cos(value);
    }

    /** ln */
    @Override
    public Double visitLn(LabeledExprParser.LnContext ctx)
    {
        Double value = this.visit(ctx.expr());
        return Math.log(value);
    }

    /** sqrt */
    @Override
    public Double visitSqrt(LabeledExprParser.SqrtContext ctx)
    {
        Double value = this.visit(ctx.expr());
        return Math.sqrt(value);
    }
    /** exp */
    @Override
    public Double visitExp(LabeledExprParser.ExpContext ctx)
    {
        Double value = this.visit(ctx.expr());
        return Math.exp(value);
    }

    /** '(' expr ')' */
    @Override
    public Double visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}