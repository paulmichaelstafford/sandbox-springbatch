package com.oghamstone.sandbox.springbatch.person

import jakarta.annotation.PostConstruct
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import org.springframework.stereotype.Service
import java.util.UUID


@Service
class PersonService(val personRepository: PersonRepository) {
    @PostConstruct
    fun populateDB() {
        var boom = personRepository.findAll()
        var person = Person()
        person.firstName = "paul"
        person.lastName = "stafford"
        personRepository.save(person)
        var i = 10;
    }


}