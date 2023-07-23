package org.example.order.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("order-service", path = OrderClient.PATH)
interface OrderClient {
    companion object {
        const val PATH = "/order"
    }

    @RequestMapping("/add")
    fun add(): String
}