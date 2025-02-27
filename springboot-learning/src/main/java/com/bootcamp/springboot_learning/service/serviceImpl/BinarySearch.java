package com.bootcamp.springboot_learning.service.serviceImpl;

import com.bootcamp.springboot_learning.service.Sort;
import com.bootcamp.springboot_learning.utils.QuickSort;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BinarySearch {
    public boolean customBinarySearch(Sort sort, List<Integer> list, int target) {
        sort.sortMethod(list);
        return Collections.binarySearch(list, target) > 0;
    }
}
