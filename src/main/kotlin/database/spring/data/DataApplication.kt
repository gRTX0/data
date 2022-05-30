package database.spring.data

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.annotation.PostConstruct
import javax.persistence.Entity
import javax.persistence.Id

@SpringBootApplication
class DataApplication{
	@GetMapping
	fun helloWorld() = "Hello World!"
}

fun main(args: Array<String>) {
	runApplication<DataApplication>(*args)
}


