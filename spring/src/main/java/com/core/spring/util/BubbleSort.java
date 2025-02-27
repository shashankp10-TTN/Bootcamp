package com.core.spring.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Qualifier("bubble")
//@Primary
public class BubbleSort implements Sort {
//    public void bubbleSort(List<Integer> list) {
//        System.out.println("---- Sorting using bubble sort ----");
//        Collections.sort(list);
//    }

    @Override
    public void sort(List<Integer> list) {
        System.out.println("---- Sorting using bubble sort ----");
        Collections.sort(list);
    }
}
