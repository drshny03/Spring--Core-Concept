package com.capgeminitrainning.springconcept.uc1;



import com.capgeminitrainning.springconcept.component.First;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;

@SpringBootApplication
public class SpringConceptApplication {

    public static void main(String[] args) {
        out.println("Welcome to spring concepts");
        //start spring application
        ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(SpringConceptApplication.class, args);

        //get object of First class

        First first =  applicationContext.getBean(First.class);
        //call first class method
        first.hello();
    }
}