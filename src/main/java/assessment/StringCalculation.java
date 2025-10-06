package assessment;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculation {

    int add(String strNumber) {
       return validateInputGenerateResult(strNumber);
    }

    private int splitValues(String strNumber) {
        String [] splitValues = strNumber.split("[,\n;]");
        int sum = 0;
        int [] negativeValue = new int [splitValues.length];
        int negativeCountIndex = 0;
        for(String strNum : splitValues) {
            int parseNum = Integer.parseInt(strNum);
            if(parseNum >= 0) {
                sum += parseNum;
            } else {
                negativeValue [negativeCountIndex] = parseNum;
                negativeCountIndex++;
            }
        }
        negativeCountIndex = 0;
        if (negativeValue[negativeCountIndex] < 0) {
            System.out.println(Arrays.toString(negativeValue));
            throw new RuntimeException("negative numbers not allowed");
        }
        return sum;
    }

    private int delimiterValue(String strNumber) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(strNumber);
        if (matcher.matches()) {
            strNumber = matcher.group(2);
            return splitValues(strNumber);
        }
        return 0;
    }

    public Exception negativeValueException(String strNum) {
        try {
            validateInputGenerateResult(strNum);
        } catch (RuntimeException e) {
            return e;
        }
        return null;
    }

    private int validateInputGenerateResult(String strNumber) {
        if (strNumber.isEmpty()) {
            return 0;
        }else if (!strNumber.startsWith("//")) {
            return splitValues(strNumber);
        } else{
            return delimiterValue(strNumber);
        }
    }






}

