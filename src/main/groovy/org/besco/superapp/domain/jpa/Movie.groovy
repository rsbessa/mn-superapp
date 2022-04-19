package org.besco.superapp.domain.jpa

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Movie {
    @Id
    @GeneratedValue
    Long id

    String name

    @Column(name="fullPath")
    String fullPath

    Integer year

    @Column(name="readableSize")
    String readableSize

    @Column(name="sizeInBytes")
    Long sizeInBytes
}
