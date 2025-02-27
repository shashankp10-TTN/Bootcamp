package com.core.spring.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Qualifier("quick")
//@Primary
public class QuickSort implements Sort{
//    public void quickSort(List<Integer> list) {
//        System.out.println("---- Sorting using quick sort ----");
//        Collections.sort(list);
//    }

    @Override
    public void sort(List<Integer> list) {
        System.out.println("---- Sorting using quick sort ----");
        Collections.sort(list);
    }
}
