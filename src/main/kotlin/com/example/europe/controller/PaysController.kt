package com.example.europe.controller

import com.example.europe.model.Pays
import com.example.europe.repository.PaysRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class PaysController  constructor(private val paysRepository: PaysRepository){

    @GetMapping("/pays")
    fun index(model: Model): String {
        model["title"] = "Les pays"
        model["pays"] = paysRepository.findAll()
        println(model)
        return "pays/index"
    }

    @GetMapping("api/pays")
    fun getAllPays(): List<Pays> =
        paysRepository.findAll()
}