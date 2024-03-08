package com.programwind.springboot;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

@Component

public class MyCommandLineRunner implements CommandLineRunner {

@Override

public void run(String... args) throws Exception {

// Your initialization code here

System.out.println("Executing CommandLineRunner");

}

}