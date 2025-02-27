package com.core.spring.service;

import com.core.spring.util.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BinarySearch {
    /* Question-1 -> BinarySearch is tightly coupled with BubbleSort

      public boolean isElementPresent(List<Integer> list, int target) {

                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.bubbleSort(list);
                return Collections.binarySearch(list, target) > 0;
        }
    */

    /* Question-2 -> BinarySearch is loosely coupled using Sort interface

        public boolean isElementPresent(Sort sort, List<Integer> list, int target) {
            sort.sort(list);
            return Collections.binarySearch(list, target) > 0;
        }
     */

    /*

        @Autowired
        @Qualifier("quick")
        private Sort sort;

        @Autowired
        private Sort bubbleSort;
    */

    // Q6. Perform Constructor Injection in a Spring Bean
    private final Sort sort;

    @Autowired
    public BinarySearch(@Qualifier("quick") Sort sort) {
        this.sort = sort;
    }

    public boolean isElementPresent(List<Integer> list, int target) {
        sort.sort(list);
        return Collections.binarySearch(list, target) > 0;
    }
}
