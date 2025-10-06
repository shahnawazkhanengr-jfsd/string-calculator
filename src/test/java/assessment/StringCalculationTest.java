package assessment;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculationTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculation stringCalculation = new StringCalculation();
        assertEquals(0, stringCalculation.add(""));
        assertEquals(1, stringCalculation.add("1"));
        assertEquals(6, stringCalculation.add("1,5"));
    }
}