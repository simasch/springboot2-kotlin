package com.example.demo.control

import com.example.demo.entity.Demo
import org.springframework.data.jpa.repository.JpaRepository

interface DemoRepository : JpaRepository<Demo, Int>