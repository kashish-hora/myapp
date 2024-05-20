package com.Todo.TodoManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoManagerApplication

fun main(args: Array<String>) {
	runApplication<TodoManagerApplication>(*args)
}
