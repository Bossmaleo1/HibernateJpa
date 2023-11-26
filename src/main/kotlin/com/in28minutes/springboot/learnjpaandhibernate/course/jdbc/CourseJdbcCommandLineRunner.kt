package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import kotlin.jvm.Throws

@Component
class CourseJdbcCommandLineRunner(
    //@Autowired
    //val repository: CourseJdbcRepository
    /*@Autowired
    val repository: CourseJpaRepository*/
    val repository: CourseSpringDataJpaRepository
) : CommandLineRunner {

    /*@Throws
    override fun run(vararg args: String?) {
        repository.insert(Course(1, "Learn Aws Now!", "in28minutes"))
        repository.insert(Course(2, "Learn Azure Now!", "in28minutes"))
        repository.insert(Course(3, "Learn DevOps Now!", "in28minutes"))

        repository.deleteById(1)

        println(repository.findById(0))
        println(repository.findById(3))
    }*/

    /*@Throws
    override fun run(vararg args: String?) {
        repository.insert(Course(1, "Learn Aws Jpa!", "in28minutes"))
        repository.insert(Course(2, "Learn Azure Jpa!", "in28minutes"))
        repository.insert(Course(3, "Learn DevOps Jpa!", "in28minutes"))

        repository.deleteById(1)

        println(repository.findById(2))
        println(repository.findById(3))
    }*/

    @Throws
    override fun run(vararg args: String?) {
        repository.save(Course(1, "Learn Aws Jpa!", "in28minutes"))
        repository.save(Course(2, "Learn Azure Jpa!", "in28minutes"))
        repository.save(Course(3, "Learn DevOps Jpa!", "in28minutes"))

        repository.deleteById(1L)

        println(repository.findById(2L))
        println(repository.findById(3L))
    }

}