package by.galov.calc;

public class MemoryManager {
    private double mem = 0;
    public void memoryOper(Oper op, DataParser dp){
        switch (op) {
    
            case M: this.mem = dp.getCurResult();showMem();break;
            case MM: this.mem -= dp.getCurResult();showMem();break;
            case MP: this.mem += dp.getCurResult();showMem();break;
            case MC: this.mem = 0;showMem();break;
            case MR: dp.setCurResult(this.mem);showMem();break;
        default:
            
        }
    }
    public void showMem(){
        System.out.println("The memory value is: " + mem);
    }
}
