package dev.diego;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongNumberTest {

    @Test
    public void testIsArmstrong() {
        assertTrue(ArmstrongNumber.isArmstrong(371));
        assertTrue(ArmstrongNumber.isArmstrong(153));
        assertFalse(ArmstrongNumber.isArmstrong(123));
        assertTrue(ArmstrongNumber.isArmstrong(9474));
        assertFalse(ArmstrongNumber.isArmstrong(9475));
    }
}