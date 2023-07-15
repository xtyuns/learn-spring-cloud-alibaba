package org.example.order.controller

import org.example.common.logger
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController {
    @RequestMapping("/add")
    fun add(): String {
        logger.info("下单成功")
        return "hello, world"
    }
}