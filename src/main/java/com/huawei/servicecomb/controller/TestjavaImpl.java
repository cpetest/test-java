package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-18T12:04:17.981Z")

@RestSchema(schemaId = "testjava")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class TestjavaImpl {

    @Autowired
    private TestjavaDelegate userTestjavaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestjavaDelegate.helloworld(name);
    }

}
