package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void whitespaceReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void balancedBracketsWithLettersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Abigail]"));
    }

    @Test
    public void leftBracketWithLettersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Abigail"));
    }

    @Test
    public void rightBracketWithLettersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Abigail]"));
    }

    @Test
    public void backwardsBracketsWithLettersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Abigail["));
    }

    @Test
    public void backwardsBracketsWithLettersOutsideReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Ab]ig[ail"));
    }

    @Test
    public void bracketsWithLettersOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("A[big]ail"));
    }

}
