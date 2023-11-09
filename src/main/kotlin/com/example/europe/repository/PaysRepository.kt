package com.example.europe.repository

import com.example.europe.model.Pays
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaysRepository : JpaRepository<Pays, Long>