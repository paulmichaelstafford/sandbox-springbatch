package com.oghamstone.sandbox.springbatch.person

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.context.annotation.Primary
import java.util.UUID
import javax.annotation.processing.Generated


@Entity
class Person {

    @Id
    @Generated
    var id: UUID? = null
    @Column(name = "first_name")
    var firstName: String? = null
    @Column(name = "last_name")
    var lastName: String? = null


}