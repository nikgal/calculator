package by.galov.calc;

public class EngCalcMem extends EngCalc {
    private MemoryManager mm;

    public EngCalcMem(DataParser dp) {
        super(dp);
        this.dp = dp;
        this.mm = new MemoryManager();
    }

    @Override
    public void extraOper(Oper curOper) {
        super.extraOper(curOper);
        mm.memoryOper(curOper, dp);
        
    }

   

}
