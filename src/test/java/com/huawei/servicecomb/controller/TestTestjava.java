package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestjava {

        TestjavaDelegate testjavaDelegate = new TestjavaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testjavaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}