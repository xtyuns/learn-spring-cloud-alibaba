package org.example.stock.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("stock-service", path = StockClient.PATH)
interface StockClient {
    companion object {
        const val PATH = "/stock"
    }

    @GetMapping("/getName")
    fun getName(): String
}
