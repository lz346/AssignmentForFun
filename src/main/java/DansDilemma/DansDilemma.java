package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    private Set possibleResultOfTwo(Double input1, Double input2){
        Set<Double> result = new HashSet<Double>();
        //add
        result.add(input1+input2);
        //multply
        result.add(input1*input2);
        //subtract
        result.add(input1-input2);
        result.add(input2-input1);
        //division
        if (input1 == 0){
            if (input2 == 0){
                //both inputs are zero, so all resluts are undefind
                return result;
            }
            else {
                //one input is zero, so only 0/input
                result.add(input1/input2);
            }
        }else{
            if (input2 == 0){
                //one input is zero, so only 0/input
                result.add(input2/input1);
            }
            else {
                //both inputs are not zero.
                result.add(input1/input2);
                result.add(input2/input1);
            }
        }

        return result;
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> result = possibleResultOfTwo(input1, input2);
        return result.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> result = new HashSet<Double>();
        result.addAll(possibleResultOfTwo(input1, input2));
        result.addAll(possibleResultOfTwo(input1, input3));
        result.addAll(possibleResultOfTwo(input3, input2));
        return result.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> result = new HashSet<Double>();
        for (int i = 0; i < args.length-1; i++){
            for (int j = i+1; j < args.length; j++){
                result.addAll(possibleResultOfTwo(args[i], args[j]));
            }
        }
        return result.size();
    }
}
