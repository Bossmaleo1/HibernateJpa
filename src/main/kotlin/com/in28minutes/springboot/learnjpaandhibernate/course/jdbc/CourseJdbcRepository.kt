package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CourseJdbcRepository(
    @Autowired
    val springJdbcTemplate: JdbcTemplate
) {

    companion object {
        val INSERT_QUERY = """
           insert into course (id, name, author)
            values(?, ?, ?);
        """

        val DELETE_QUERY = """
            delete from course
            where id = ?
        """


        val SELECT_QUERY = """
            select * from course
            where id = ?
        """
    }

    fun insert(course: Course) {
        springJdbcTemplate.update(INSERT_QUERY,
            course.id, course.name, course.author)
    }

    fun deleteById(id: Long) {
        springJdbcTemplate.update(DELETE_QUERY,id)
    }

    fun findById(id: Long): Course? {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
            BeanPropertyRowMapper.newInstance(Course::class.java) , id)
    }

}