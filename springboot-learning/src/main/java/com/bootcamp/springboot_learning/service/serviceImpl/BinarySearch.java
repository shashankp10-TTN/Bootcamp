package com.bootcamp.springboot_learning.service;

import com.bootcamp.springboot_learning.utils.BubbleSort;
import com.bootcamp.springboot_learning.utils.QuickSort;

import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public boolean binarySearch(QuickSort sort, List<Integer> list, int target) {

        sort.quickSortMethod(list);
        return Collections.binarySearch(list, target) > 0;
    }
}
