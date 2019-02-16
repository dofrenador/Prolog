grammar Calculator;

@header {
import java.util.*;
}

@members{
    Map<String,Double> memory = new HashMap<String,Double>();
    double a;
}

exprList: stat ( ';' stat)* ';'?; 


stat: expr  {System.out.println($expr.i);}
|ID '=' expr { memory.put($ID.text,$expr.i);}
|ID '*=' expr  { if(!memory.containsKey($ID.text)){
                    System.out.println($expr.i);
                 }
                 else{
                    memory.put($ID.text,memory.get($ID.text)*$expr.i);
                 }
               }
|ID '/=' expr  { if(!memory.containsKey($ID.text)){
                    System.out.println($expr.i);
               }
                else{
                    memory.put($ID.text,memory.get($ID.text)/$expr.i);
                }
               }
|ID '+=' expr  { if(!memory.containsKey($ID.text)){
                    System.out.println($expr.i);
                 }
                 else{
                    memory.put($ID.text,$expr.i+memory.get($ID.text));
                 }

               }
|ID '-=' expr  { if(!memory.containsKey($ID.text)){
                    System.out.println($expr.i);
                 }  
                else{
                    memory.put($ID.text,memory.get($ID.text)-$expr.i);
                }
               }
;

expr returns [double i]
: LPAREN expr RPAREN { $i=$expr.i; }
| el=expr op='^' er=expr {$i=Math.pow($el.i,$er.i);}
| el=expr op='*' er=expr { $i=$el.i*$er.i; }
| el=expr op='/' er=expr { $i=$el.i/$er.i; 
                           if($er.i == 0) 
                           System.err.println("Runtime Error - Divide by zero"); 
                           else
                           $i=$el.i/$er.i; 
                         }  
| el=expr op='-' er=expr { $i=$el.i-$er.i; }
| el=expr op='+' er=expr { $i=$el.i+$er.i; }
| el=expr op='%' er=expr { $i=$el.i%$er.i; }
|         op='-' er=expr { $i =$er.i*(-1.0); } 
| op='++' ID { if(!memory.containsKey($ID.text)){
                    $i=1;
                    memory.put($ID.text,1.0);
               }
                else{
                    $i=memory.get($ID.text)+1.0;  
                    memory.put($ID.text,memory.get($ID.text)+1.0); 
                }
                  }
| op='--' ID { if(!memory.containsKey($ID.text)){
                    $i=1;
                    memory.put($ID.text,1.0);
               }
                else{
                    $i=memory.get($ID.text)-1.0;  
                    memory.put($ID.text,memory.get($ID.text)-1.0); 
                }
                  }
| ID op='++' { if(!memory.containsKey($ID.text)){
                    $i=1;
                    memory.put($ID.text,1.0);
               }
                else{
                    $i=memory.get($ID.text)+1.0;  
                    memory.put($ID.text,memory.get($ID.text)+1.0); 
                }
                  }
| ID op='--' { if(!memory.containsKey($ID.text)){
                    $i=1;
                    memory.put($ID.text,1.0);
               }
                else{
                    $i=memory.get($ID.text)-1.0;  
                    memory.put($ID.text,memory.get($ID.text)-1.0); 
                }
             }
| SQRT el = expr ')' {$i=Math.sqrt($el.i);}                   
| SIN  el=expr ')' {$i=Math.sin($el.i); }
| COS  el=expr ')' {$i=Math.cos($el.i); }
| LN  el=expr ')' {$i=Math.log($el.i); }
| EXP el=expr ')' {$i=Math.exp($el.i);}
| ID '=' READ          {
                       Scanner in = new Scanner(System.in);
                       a = in.nextDouble();
                    //    System.out.println("You have entered: " + a); 
                       memory.put($ID.text, a);
                   }
| op='!' er=expr {if($er.i == 0) {$i = 1;}else{$i = 0;}}
| el=expr op='&&'er=expr  {if($el.i > 0 && $er.i > 0){$i =1;}else{$i =0;}}
| el=expr op='||' er=expr { if($el.i !=  0 || $er.i != 0){$i = 1;}else{$i = 0;} }
| DOUBLE { $i=Double.parseDouble($DOUBLE.text);}
| INT { $i=Integer.parseInt($INT.text); }
| ID  
    {
       Double v = (Double)memory.get($ID.text);
       if(v!=null) $i = v.doubleValue();     
    }              
| '(' e=expr ')'  
;    


ID: [_A-Za-z]+;
INT: [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
DOUBLE: '-'?[0-9]+('.'[0-9]+)?;
COMMENT: '/*' .*? '*/' -> skip;
SIN: 's(' ;
COS: 'c(' ;
LN: 'l(' ;
EXP: 'e(' ; 
SQRT: 'sqrt(' ;
READ: 'read()';
LPAREN: '(' ;
RPAREN: ')' ;
