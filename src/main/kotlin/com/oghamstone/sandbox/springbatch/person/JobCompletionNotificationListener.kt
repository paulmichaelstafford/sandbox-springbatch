package com.oghamstone.sandbox.springbatch.person

import org.slf4j.LoggerFactory
import org.springframework.batch.core.BatchStatus
import org.springframework.batch.core.JobExecution
import org.springframework.batch.core.JobExecutionListener
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class JobCompletionNotificationListener(private val jdbcTemplate: JdbcTemplate): JobExecutionListener  {

    val log = LoggerFactory.getLogger(javaClass)

    @Override
    fun afterJob(jobExecution: JobExecution) {
        if(jobExecution.getStatus().equals(BatchStatus.COMPLETED)) {
            log.info("!!! JOB FINISHED! Time to verify the results");

            jdbcTemplate.query("SELECT first_name, last_name FROM people",
                    (rs, row) -> new Person(
            rs.getString(1),
            rs.getString(2))
            ).forEach(person -> log.info("Found <{{}}> in the database.", person));
        }
    }
}
