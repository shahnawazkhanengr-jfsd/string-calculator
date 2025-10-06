package assessment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculation {

    int add(String strNumber) {
        if (strNumber.isEmpty()) {
            return 0;
        } else if (!strNumber.startsWith("//")) {
            return splitValues(strNumber);
        } else {
            return delimiterValue(strNumber);
        }
    }

    private int splitValues(String strNumber) {
        String [] splitValues = strNumber.split("[,\n;]");
        int sum = 0;
        for(String strNum : splitValues) {
            sum += Integer.parseInt(strNum);
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








}

