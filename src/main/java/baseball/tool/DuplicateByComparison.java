package baseball.tool;

import java.util.ArrayList;
import java.util.List;


import static baseball.tool.BeforeVerificationSetting.makeNumberSplitList;

public class DuplicateByComparison {

    public static boolean confirmOverlapNumberHave(List<Integer> answerNumber, int receivedNumber){
        return findOverlapNumber(answerNumber, receivedNumber).size() > 0;
    }

    public static List<Integer> findOverlapNumber(List<Integer> answerNumber , int receivedNumber){
        List<Integer> overlapNumber = new ArrayList<>();

        for(int number : answerNumber){
            if(makeNumberSplitList(receivedNumber).contains(number)){
                overlapNumber.add(number);
            }
        }
        return overlapNumber;
    }
}
