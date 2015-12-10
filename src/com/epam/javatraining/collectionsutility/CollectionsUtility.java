package com.epam.javatraining.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class CollectionsUtility {

    public <T extends Comparable<? super T>> T avg(Collection<? extends T> inputElements) {
        if (inputElements.isEmpty()) {
            throw new IllegalArgumentException("Your data is empty!");
        }
        
        T middleElement;
        List<T> elements = new ArrayList<>(inputElements);
        Collections.sort(elements);
        middleElement = elements.get(elements.size() / 2);
        return middleElement;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 5, 19, 4, 7, 0, 125, 10);
        CollectionsUtility middleElement = new CollectionsUtility();
        Integer result = middleElement.avg(intList);
        System.out.println("middle element:" + result);

        List<String> strList = Arrays.asList("ann", "mua", "buuu");
        CollectionsUtility elements = new CollectionsUtility();
        String resultStr = elements.avg(strList);
        System.out.println("middle element:" + resultStr);
    }
}
