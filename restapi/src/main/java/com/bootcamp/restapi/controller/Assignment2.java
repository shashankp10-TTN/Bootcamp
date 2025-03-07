package com.bootcamp.restapi.controller;

import com.bootcamp.restapi.entity.Name;
import com.bootcamp.restapi.entity.User;
import com.bootcamp.restapi.entity.UserFilter;
import com.bootcamp.restapi.entity.UserV2;
import com.bootcamp.restapi.exception.UserNotFoundException;
import com.bootcamp.restapi.service.UserService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class Assignment2 {

    private final MessageSource messageSource;

    private final UserService userService;
    /*
        Q1. Internationalization
            A) Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
            B) Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)
     */
    @GetMapping("/internationalization/{username}")
    public ResponseEntity<String> internationalization(@PathVariable String username) {
        Locale locale = LocaleContextHolder.getLocale();
        String LocaleMessage = messageSource.getMessage("hello.message", null, "Default message", locale);
        String responseMessage = String.format("%s %s", LocaleMessage, username);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    /*
        Q2. Content Negotiation
            A) Create POST Method to create user details which can accept XML for user creation.
            B) Create GET Method to fetch the list of users in XML format.
     */


    // Key = Content-Type,  Value=application/xml OR set produces="application/xml"
    @PostMapping("/add")
    public ResponseEntity<String> createUserWhichAcceptsXML(@Valid @RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
    }

    // Key = Accept,  Value=application/xml
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsersInXML() {
        List<User> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    /*
        Q3. Swagger
        A) Configure the swagger plugin and create a document of the following methods:
            Get details of the User using GET request.
            Save details of the user using POST request.
            Delete a user using DELETE request.
        B) In swagger documentation, add the description of each class and URI so that in swagger UI the purpose of class and URI is clear.

        Ans. For this question I have added the springdoc-openapi-starter-webmvc-ui dependency and hit the URL http://localhost:8080/swagger-ui/index.html#/
        everything is autoconfigured
     */

    /*
       Q4. Static and Dynamic filtering
            A) Create API which saves details of User (along with the password) but on successfully saving returns only non-critical data. (Use static filtering)
            B) Create another API that does the same by using Dynamic Filtering.
     */
            /*          Static filtering
                   @JsonIgnoreProperties("password")  --> at class level
                   @JsonIgnore --> at field level
             */
    @PostMapping("/static/filter")
    public ResponseEntity<UserFilter> staticFiltering() {
        UserFilter userFilter = new UserFilter(1L, "Shashank", "password", 99);

        return new ResponseEntity<>(userFilter, HttpStatus.OK);
    }
            /*          Dynamic filtering
                   @JsonIgnoreProperties("password")  --> at class level
                   @JsonIgnore --> at field level
             */
    @GetMapping("/dynamic/filter")
    public ResponseEntity<MappingJacksonValue> dynamicFiltering() {
        UserFilter userFilterBean = new UserFilter(1L, "Shashank", "password", 99);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userFilterBean);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name","age");
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return new ResponseEntity<>(mappingJacksonValue, HttpStatus.OK);
    }

    /*
        Q5. Versioning Restful APIs Create 2 API for showing user details.
            The first api should return only basic details of the user and the other API should return more/enhanced details of the user,
            Now apply versioning using the following methods:
                    A) MimeType Versioning
                    B) Request Parameter versioning
                    C) URI versioning
                    D) Custom Header Versioning
     */
    // URI versioning
    @GetMapping("/v1/get")
    public ResponseEntity<User> getUserNameUsingURI1() {
        User newUser = new User(5L, "Shashank Pandey", 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping("/v2/get")
    public ResponseEntity<UserV2> getUserNameUsingURI2() {
        UserV2 newUser = new UserV2(5L, new Name("Shashank", "Pandey"), 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    //  Request Parameter versioning

    // localhost:8080/user/get?version=1
    @GetMapping(value = "/get/params", params = "version=1")
    public ResponseEntity<User> getUserNameUsingRequestParams1() {
        User newUser = new User(5L, "Shashank Pandey", 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping(value = "/get/params", params = "version=2")
    public ResponseEntity<UserV2> getUserNameUsingRequestParams2() {
        UserV2 newUser = new UserV2(5L, new Name("Shashank", "Pandey"), 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    //  Custom Header Versioning
    // have to set key, value in header
    @GetMapping(value = "/get/header", headers = "my-header=1")
    public ResponseEntity<User> getUserNameUsingHeader1() {
        User newUser = new User(5L, "Shashank Pandey", 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping(value = "/get/header", headers = "my-header=2")
    public ResponseEntity<UserV2> getUserNameUsingHeader2() {
        UserV2 newUser = new UserV2(5L, new Name("Shashank", "Pandey"), 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    //  MimeType Versioning
    // have to set key, value in header
    @GetMapping(value = "/get/mime", produces = "application/com.bootcamp.app-v1+json")
    public ResponseEntity<User> getUserNameUsingMimeType1() {
        User newUser = new User(5L, "Shashank Pandey", 99);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

//    @GetMapping(value = "/get/mime", produces = "")
//    public ResponseEntity<UserV2> getUserNameUsingMimeType2() {
//        UserV2 newUser = new UserV2(5L, new Name("Shashank", "Pandey"), 99);
//        return new ResponseEntity<>(newUser, HttpStatus.OK);
//    }

    /*
        Q6. HATEOAS A) Configure hateoas with your springboot application.
            Create an api which returns User Details along with url to show all topics.
     */

    @GetMapping("/getAllTopics")
    public ResponseEntity<List<String>> getAllTopics() {
        List<String> listOfTopics = userService.getAllTopics();
        return new ResponseEntity<>(listOfTopics, HttpStatus.OK);
    }

    @PostMapping("/hateoas/add")
    public ResponseEntity<User> createUserWithHATEOAS(@RequestBody User user) {
        User addedUser = userService.addUser(user);
        List<String> listOfTopics = userService.getAllTopics();

        Link getAllTopicsLinks = WebMvcLinkBuilder
                            .linkTo(WebMvcLinkBuilder
                            .methodOn(Assignment2.class)
                            .getAllTopics())
                            .withRel("all-topics");
//        addedUser.add(getAllTopicsLinks);
        return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
    }
}

