package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_class;

    @Before
    public void setup() {
        test_class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets(""));
    }

    @Test
    public void whitespaceReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets(" "));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]["));
    }

    @Test
    public void balancedBracketsWithLettersReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[Abigail]"));
    }

    @Test
    public void leftBracketWithLettersReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[Abigail"));
    }

    @Test
    public void rightBracketWithLettersReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("Abigail]"));
    }

    @Test
    public void backwardsBracketsWithLettersReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]Abigail["));
    }

    @Test
    public void backwardsBracketsWithLettersOutsideReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("Ab]ig[ail"));
    }

    @Test
    public void bracketsWithLettersOutsideReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("A[big]ail"));
    }

}
