package by.galov.calc;

public abstract class Calc {
    DataParser dp;
    public  double calculate(){
        while(!dp.getStack().empty()){
            Oper curOper;
            switch (curOper = dp.getStack().pop()) {
                case MULT: dp.pushResult(dp.getResult().pop() * dp.getResult().pop());break;
                case DIF: dp.pushResult (dp.getResult().pop() - dp.getResult().pop());break; 
                case SUM: dp.pushResult (dp.getResult().pop() + dp.getResult().pop());break;
                case DIV: dp.pushResult (dp.getResult().pop() / dp.getResult().pop());break;
        
            default:
                extraOper(curOper);
            }
        }
    return dp.getResult().pop();
    }
    public abstract void extraOper(Oper curOper);
}
