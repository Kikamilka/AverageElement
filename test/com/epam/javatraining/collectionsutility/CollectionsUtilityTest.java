package com.epam.javatraining.collectionsutility;

import java.util.Arrays;
import java.util.List;
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
    public void testAvgInt() {
        System.out.println("avg Integer");
        List<Integer> intList = Arrays.asList(5, 19, 0, 125, 10);
        CollectionsUtility avgElement = new CollectionsUtility();
        int result = avgElement.avg(intList);
        assertEquals(10, result); 
    }
    
    @Test
    public void testAvgString() {
        System.out.println("avg String");
        List<String> strList = Arrays.asList("ann", "mua", "buuu");
        CollectionsUtility avgElement = new CollectionsUtility();
        String resultStr = avgElement.avg(strList);
        assertEquals("buuu", resultStr); 
    }

}
