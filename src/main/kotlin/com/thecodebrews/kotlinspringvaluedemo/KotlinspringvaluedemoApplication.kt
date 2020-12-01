package com.thecodebrews.kotlinspringvaluedemo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class KotlinspringvaluedemoApplication(
	@Value("\${application.name}") private val appName: String
) {
	@Value("\${store.name}")
	val storeName: String = ""

	@Value("\${store.address}")
	val storeAddress: String = ""

	@PostConstruct
	fun getStoreInfo() {
		println("Store name: $storeName")
		println("Store address: $storeAddress")
		println("Application name: $appName")
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinspringvaluedemoApplication>(*args)
}
