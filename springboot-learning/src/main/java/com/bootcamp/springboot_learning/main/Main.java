package com.bootcamp.springboot_learning.main;

import com.bootcamp.springboot_learning.service.Sort;
import com.bootcamp.springboot_learning.service.serviceImpl.BinarySearch;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Main {

//    private final BinarySearch binarySearch;
//    private final Sort sort;

//    @Autowired
//    public Main(BinarySearch binarySearch, @Qualifier("quick") Sort sort) {
//        this.binarySearch = binarySearch;
//        this.sort = sort;
//    }

//    @Autowired private final BinarySearch binarySearch;
//    private final Sort sort;

    @Autowired
    public BinarySearch binarySearch;

    private Sort sort;

    @Autowired
    @Qualifier("quick")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void print() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,7,23,12,90,33,19));
        System.out.println(binarySearch.customBinarySearch(sort, list,23));
    }
    @PostConstruct
    void print1() {
        System.out.println("hii");
    }
}
