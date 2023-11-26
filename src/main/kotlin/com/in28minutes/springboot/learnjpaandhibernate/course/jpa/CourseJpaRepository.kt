package com.in28minutes.springboot.learnjpaandhibernate.course.jpa

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.Course
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
@Transactional
class CourseJpaRepository(
    @PersistenceContext
    val entityManager: EntityManager
) {

    fun insert(course: Course) {
        entityManager.merge(course)
    }

    fun findById(id: Long): Course {
        return entityManager.find(Course::class.java, id)
    }

    fun deleteById(id: Long) {
        val course = entityManager.find(Course::class.java, id)
        return entityManager.remove(course)
    }

}