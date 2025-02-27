package com.bootcamp.springboot_learning;

import com.bootcamp.springboot_learning.main.Main;
import com.bootcamp.springboot_learning.service.Sort;
import com.bootcamp.springboot_learning.service.serviceImpl.BinarySearch;
import com.bootcamp.springboot_learning.utils.BubbleSort;
import com.bootcamp.springboot_learning.utils.QuickSort;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringbootLearningApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootLearningApplication.class, args);

		Main main = applicationContext.getBean(Main.class);
		Main main1 = applicationContext.getBean(Main.class);
		QuickSort q1 = applicationContext.getBean(QuickSort.class);
		QuickSort q2 = applicationContext.getBean(QuickSort.class);


		System.out.println(q1);
		System.out.println(q2);
		main.print();

	}

}
