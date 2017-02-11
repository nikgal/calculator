package by.galov.calc;

public class SimpleCalcMem extends Calc {
    private MemoryManager mm;
    public SimpleCalcMem(DataParser dp) {
        this.dp = dp;
        this.mm = new MemoryManager();
    }

    @Override
    public void extraOper(Oper curOper) {
      
       mm.memoryOper(curOper, dp);
    }

   

}
