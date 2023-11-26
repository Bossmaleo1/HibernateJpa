package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseSpringDataJpaRepository : JpaRepository<Course, Long> {

    fun findByAuthor(author: String): List<Course>
}