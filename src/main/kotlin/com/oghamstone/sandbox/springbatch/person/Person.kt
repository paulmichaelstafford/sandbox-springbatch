package com.oghamstone.sandbox.springbatch.person

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import java.util.UUID


@Entity
class Person {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    var id: UUID? = null
    @Column(name = "first_name")
    var firstName: String? = null
    @Column(name = "last_name")
    var lastName: String? = null


}