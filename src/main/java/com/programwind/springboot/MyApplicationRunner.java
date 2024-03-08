package com.programwind.springboot;

import org.springframework.boot.ApplicationArguments;

import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component

public class MyApplicationRunner implements ApplicationRunner {

@Override

public void run(ApplicationArguments args) throws Exception {

// Your initialization code here

System.out.println("Executing ApplicationRunner");

}

}