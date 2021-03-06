package me.harry.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
class JpaApplication

fun main(args: Array<String>) {
    runApplication<JpaApplication>(*args)
}
