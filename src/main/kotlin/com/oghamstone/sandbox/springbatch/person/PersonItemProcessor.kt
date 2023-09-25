package com.oghamstone.sandbox.springbatch.person

import org.slf4j.LoggerFactory
import org.springframework.batch.item.ItemProcessor
import java.util.*
import java.util.logging.Logger

class PersonItemProcessor: ItemProcessor<Person, Person> {

    val log = LoggerFactory.getLogger(javaClass)

    @Throws(Exception::class)
    override fun process(person: Person): Person {
        val firstName = person.firstName!!.uppercase(Locale.getDefault())
        val lastName = person.lastName!!.uppercase(Locale.getDefault())
        val transformedPerson = Person()
        transformedPerson.firstName = firstName.lowercase()
        transformedPerson.lastName = lastName.lowercase()
        log.info("Converting ($person) into ($transformedPerson)")
        return transformedPerson
    }
}