package org.example.order.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("order-service", path = "order")
interface OrderClient {
    @RequestMapping("/add")
    fun add(): String
}