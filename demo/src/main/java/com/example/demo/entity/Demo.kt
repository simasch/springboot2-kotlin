package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Demo {

    @Id
    @GeneratedValue
    var id: Int? = 0
    var name: String = ""
}