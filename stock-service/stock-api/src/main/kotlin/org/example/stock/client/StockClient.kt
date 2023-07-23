package org.example.stock.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("stock-service", path = "stock")
interface StockClient {
    @GetMapping("/getName")
    fun getName(): String
}