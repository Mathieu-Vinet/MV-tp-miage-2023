package com.acme.todolist;

import com.acme.todolist.domain.TodoItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.Instant;

@SpringBootTest(classes = TodoItem.class)
class TodolistApplicationTests {
	private TodoItem todoItem;

	@Test
	void contextLoads() {

		todoItem = new TodoItem("test", Instant.now(), "Je suis pas late :)");
		Assertions.assertEquals("Je suis pas late :)",todoItem.finalContent());

		todoItem = new TodoItem("test", Instant.parse("2020-02-27T10:31:43Z"), "Je suis late :)");
		Assertions.assertEquals("[LATE!] Je suis late :)",todoItem.finalContent());
	}

}
