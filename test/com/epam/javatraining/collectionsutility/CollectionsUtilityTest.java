package com.epam.javatraining.collectionsutility;

import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionsUtilityTest {

    public CollectionsUtilityTest() {
    }

    @Test
    public void testAvgNull() {
        System.out.println("check null argument");
        CollectionsUtility instance = new CollectionsUtility();
        try {
            instance.avg(null);
            fail("NullPointerException was expected");
        } catch (NullPointerException ex) {
        }
    }

    @Test
    public void testAvg() {
        System.out.println("avg");
        Collection inputElements = null;
        CollectionsUtility instance = new CollectionsUtility();
        Object expResult = null;
        Object result = instance.avg(inputElements);
        assertEquals(expResult, result);
    }

}
