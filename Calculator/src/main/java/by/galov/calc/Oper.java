package by.galov.calc;

public enum Oper {
    SUM,COS,SQRT,EXP,MULT,DIF,NO, DIV, MP, MM, MC, M, MR;
    
    public static Oper isOper(String s) {
        if (s.equals("+")) return Oper.SUM;
        if (s.equals("-")) return Oper.DIF;
        if (s.equals("*")) return Oper.MULT;
        if (s.equals("/")) return Oper.DIV;
        if (s.equals("cos")) return Oper.COS;
        if (s.equals("exp")) return Oper.EXP;
        if (s.equals("sqrt")) return Oper.SQRT;
        if (s.equals("m+")) return Oper.MP;
        if (s.equals("m-")) return Oper.MM;
        if (s.equals("mc")) return Oper.MC;
        if (s.equals("mr")) return Oper.MR;
        if (s.equals("m")) return Oper.M;

        else return Oper.NO;
      }
    public void execOper(Oper op){
        
    }
}
