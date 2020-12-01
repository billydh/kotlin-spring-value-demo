package com.thecodebrews.kotlinspringvaluedemo

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class StoreConfiguration(
    @Value("\${store.no-of-customers-capacity}") val capacity: Int
) {
    @Value("\${store.size-in-meter-square}")
    val size: Int = 0

    @PostConstruct
    fun getStoreConfiguration() {
        print("Store size is $size meter square\n")
        print("Store max capacity is $capacity customers\n")
    }
}
