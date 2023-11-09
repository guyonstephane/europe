package com.example.europe.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
data class Pays (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,


    @Column(name = "1_code")
    val code: String = "",

    @Column(name = "2_name")
    val name : String = "",

    @Column(name = "3_full_name")
    val full_name : String = "",

    @Column(name = "4_iso3")
    val iso3 : String = "",

)