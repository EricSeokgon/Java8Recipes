package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by hadeslee on 2016-12-11.
 */
public class PassingLambdaFunctions {
    public Double calculate(Function<List<Double>, Double> f1,
                            Double [] args){
        Double returnVal;
        List<Double> varList = new ArrayList();
        int idx = 0;
        while (idx < args.length){
            varList.add(args[idx]);
            idx++;
        }
        returnVal=f1.apply(varList);
        return returnVal;
    }
}
