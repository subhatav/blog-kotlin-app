package com.ph4ntom.of.codes.blogapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BloggingApplication

fun main(args: Array<String>) {

    runApplication<BloggingApplication>(*args)
}
