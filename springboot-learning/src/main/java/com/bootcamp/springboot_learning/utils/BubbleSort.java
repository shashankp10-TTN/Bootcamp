package com.bootcamp.springboot_learning.utils;

import com.bootcamp.springboot_learning.service.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Qualifier("bubble")
//@Primary
public class BubbleSort implements Sort {

    @Override
    public void sortMethod(List<Integer> list) {
        System.out.println("Sorting using bubble sort");
        Collections.sort(list);
    }
}
