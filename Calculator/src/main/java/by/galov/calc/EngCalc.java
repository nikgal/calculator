package by.galov.calc;

public class EngCalc extends Calc {

    public EngCalc(DataParser dp) {
        this.dp = dp;
    }


    public void extraOper(Oper curOper){
        switch (curOper) {

            case COS: dp.pushResult (Math.cos(dp.getResult().pop()));break;
            case EXP: dp.pushResult (Math.exp(dp.getResult().pop()));break;
            case SQRT: dp.pushResult (Math.sqrt(dp.getResult().pop()));break;
    
        default:
            
        }
    }
       

}
