package com.spring.demo.sidebyside.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.sidebyside.todo.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

}