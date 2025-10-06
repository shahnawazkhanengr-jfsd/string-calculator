package assessment;

public class StringCalculation {

    int add(String strNumber) {
        if (strNumber.isEmpty()) {
            return 0;
        } else if (!strNumber.startsWith("//")) {
            return splitValues(strNumber);
        } else {
            return Integer.parseInt(strNumber);
        }
    }

    private int splitValues(String strNumber) {
        String [] splitValues = strNumber.split(",");
        int sum = 0;
        for(String strNum : splitValues) {
            sum += Integer.parseInt(strNum);
        }
        return sum;
    }








}

