package com.core.spring.service;

import com.core.spring.util.BubbleSort;
import com.core.spring.util.QuickSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Main {

    @Autowired
    private BinarySearch binarySearch;

    public void print() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,8,34,21,90,5));
        System.out.println(binarySearch.isElementPresent(list,3));
    }
}
