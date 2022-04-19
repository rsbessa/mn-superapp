package org.besco.superapp.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import org.besco.superapp.data.repository.MovieRepository
import org.besco.superapp.domain.jpa.Movie

@Controller("/restapi")
class RestApiController {

    @Inject MovieRepository movieRepository

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }

    @Get("/listMoviesByYear/{year}")
    HttpResponse<Movie> getMoviesByYear(Integer year) {

    }

    @Get("/listMoviesByName/{name}")
    HttpResponse<Movie> getMoviesByYear(String name) {
        Movie movie = movieRepository.finByName(name)
        return HttpResponse.ok(movie)
    }

    @Get("/getMovieById/{id}")
    HttpResponse<Movie> getMovieById(Long id) {
//        Movie movie = movieRepository.findById(id).orElse(null)
        Movie movie = ((Iterable<Movie>)movieRepository.findAll()).getAt(0)
        return HttpResponse.ok(movie)
    }

}