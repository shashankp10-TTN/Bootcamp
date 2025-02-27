package com.core.spring;

import com.core.spring.service.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootProjectApplication.class, args);

		// Q4. Get a Spring Bean from application context and display its properties.
		Main main = applicationContext.getBean(Main.class);
		main.print();
	}
	/*
			Q5. Demonstrate how you will resolve ambiguity while autowiring bean
				=> Method 1 : Using named autowiring
						@Autowired
						private Sort bubbleSort;
				=> Method 2 : Using @Primary Annotation to decide the primary bean to inject

				=> Method 3 : Using @Qualifier Annotation and specify the bean you want to inject
						Step 1 : Add @Qualifier("some_name") on classes having the required methods
						Step 2 : @Autowired
								 @Qualifier("quick")
								 private Sort sort;
	 */

}
