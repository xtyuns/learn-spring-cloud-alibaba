package org.example.order.controller

import org.example.order.client.OrderClient
import org.example.order.service.OrderService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(OrderClient.PATH)
class OrderController(
    val orderService: OrderService
): OrderClient {
    override fun add(): String {
        val o = orderService.getName()
        return "invoke: $o"
    }
}