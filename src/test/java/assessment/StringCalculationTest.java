package assessment;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculationTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculation stringCalculation = new StringCalculation();
        assertEquals(0, stringCalculation.add(""));
        assertEquals(1, stringCalculation.add("1"));
        assertEquals(6, stringCalculation.add("1,5"));
        assertEquals(6, stringCalculation.add("1\n2,3"));
        assertEquals(3, stringCalculation.add("//;\n1;2"));
        assertEquals("negative numbers not allowed", stringCalculation.negativeValueException("//;\n-1;-2").getMessage());
    }
}