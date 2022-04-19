package org.besco.superapp.data.repository

import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import org.besco.superapp.domain.jpa.Movie

@Repository
interface MovieRepository extends CrudRepository<Movie, Long> {

}
