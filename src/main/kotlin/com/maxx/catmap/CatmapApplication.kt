package com.maxx.catmap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CatmapApplication

fun main(args: Array<String>) {
	runApplication<CatmapApplication>(*args)
}
