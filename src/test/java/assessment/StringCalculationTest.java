package assessment;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculationTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCalculation stringCalculation = new StringCalculation();
        assertEquals(0, stringCalculation.add(""));
    }
}