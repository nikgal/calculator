package by.galov.calc;

import java.util.ArrayList;
import java.util.Stack;

public class DataParser {
    private int calcType;
    private Stack<Double> result = new Stack<Double>();
    private Stack<Oper> stack = new Stack<Oper>();
    
    public void  parseToPost(ArrayList<String> data){
        for(int i = data.size() - 1; i >= 0; i--){
            String cur = data.get(i);
            if(!Oper.isOper(cur).equals(Oper.NO)){
                this.getStack().push(Oper.isOper(cur));
               
            }else this.getResult().push(Double.parseDouble(cur));
            
            
        }
        setCalcType((result.pop().intValue()));
    }  
    
    public String toString(){
        return ("stack: "+getStack().toString()+" result: "
    + getResult().toString() + " calc: " + getCalcType());
    }
        
      
  

    public Stack<Double> getResult() {
        return result;
    }
    
    public Double getCurResult() {
        return result.peek();
    }

    public void setResult(Stack<Double> result) {
        this.result = result;
    }
    
    public void pushResult(Double d) {
        this.result.push(d);
    }
    
    

    public Stack<Oper> getStack() {
        return stack;
    }

    public void setStack(Stack<Oper> stack) {
        this.stack = stack;
    }

    public int getCalcType() {
        return calcType;
    }

    public void setCalcType(int calcType) {
        this.calcType = calcType;
    }

    public void setCurResult(double d) {
        this.result.push(d);
        
    }
    
   
}
