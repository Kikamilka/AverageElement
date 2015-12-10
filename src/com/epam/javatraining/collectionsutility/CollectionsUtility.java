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
}
