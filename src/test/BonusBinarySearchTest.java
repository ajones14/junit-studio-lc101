package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    private int[] sampleArray = {1, 2, 4, 5, 8, 10};

    @Test
    public void returnsNegative1ForNoResult() {
        assertEquals(BonusBinarySearch.binarySearch(sampleArray, 3), -1, .001);
    }

    @Test
    public void returns2ForMiddleSearchTerm() {
        assertEquals(BonusBinarySearch.binarySearch(sampleArray, 4), 2, .001);
    }

    @Test
    public void returns1ForSecondSearchTerm() {
        assertEquals(BonusBinarySearch.binarySearch(sampleArray, 2), 1, .001);
    }

}
