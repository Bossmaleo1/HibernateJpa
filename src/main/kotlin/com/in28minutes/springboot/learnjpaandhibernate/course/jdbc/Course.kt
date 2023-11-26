package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "Course_Details")
data class Course(
    @Id
    val id: Long,
    val name: String,
    val author: String
)
