package com.bootcamp.springboot_learning.utils;

import com.bootcamp.springboot_learning.service.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Qualifier("quick")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuickSort implements Sort {

    @Override
    public void sortMethod(List<Integer> list) {
        System.out.println("Sorting using quick sort");
        Collections.sort(list);

    }
}
