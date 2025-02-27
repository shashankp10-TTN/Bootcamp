package com.ttn;

import com.google.gson.Gson;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class App {
    public static void main( String[] args ) {
        Employee e1 = new Employee(1, "Shashank");
        Gson gson = new Gson();
        System.out.println(gson.toJson(e1));
    }
}
/*
    Differentiate between the different dependency scopes:
        1. compile
            When I want to use any dependency right from compile time till package
        2. runtime
             When I want certain dependency to get injection at runtime for execution not at compile time
             i.e. tomcat server
        3. test
              When I want a dependency to execute only at test duration
              i.e. JUnit dependency
                  <dependency>
                      <groupId>junit</groupId>
                      <artifactId>junit</artifactId>
                      <version>3.8.1</version>
                      <scope>test</scope>
                  </dependency>
        4. provided using different dependencies being defined in your pom.xml
            When I want certain dependency to be there in the development phase only not in my build file

 */
