package org.example.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication(proxyBeanMethods = false)
@EnableDiscoveryClient
@EnableFeignClients(basePackages = ["org.example"])
class OrderApplication

fun main(args: Array<String>) {
    val application = runApplication<OrderApplication>(*args)
}
