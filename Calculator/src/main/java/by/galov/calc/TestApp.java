package by.galov.calc;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

            DataInput input = new DataInput();
            DataParser dp = new DataParser();
            ArrayList<String> da = new ArrayList<String>();
            
            input.getData();

            da = input.getDataList();
            dp.parseToPost(da);
            Calc sc = null;
            
            switch (dp.getCalcType()) {
                case 1:
                    sc = new SimpleCalc(dp);
                    break;
                case 2:
                    sc = new SimpleCalcMem(dp);
                    break;
                case 3:
                    sc = new EngCalc(dp);
                    break;
                case 4:
                    sc = new EngCalcMem(dp);
              
                   break;
    
            default:
                break;
            }
            
            System.out.println(input.toString());
            System.out.println(dp.toString());
            System.out.println(sc.calculate());
            
    }

}
