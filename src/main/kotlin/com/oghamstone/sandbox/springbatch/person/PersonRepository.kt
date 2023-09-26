package com.oghamstone.sandbox.springbatch.person

import org.springframework.data.repository.CrudRepository
import java.util.UUID


interface PersonRepository: CrudRepository<Person, UUID>