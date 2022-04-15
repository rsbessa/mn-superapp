package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/mnSuperapp")
class MnSuperappController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}