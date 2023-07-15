package org.example.stock.controller

import org.example.common.logger
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/stock")
class OrderController {
    @RequestMapping("/reduce")
    fun add(): String {
        logger.info("扣减库存")
        return "hello, world"
    }
}