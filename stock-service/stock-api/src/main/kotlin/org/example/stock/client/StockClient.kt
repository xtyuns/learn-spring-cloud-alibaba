package org.example.stock.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("stock-service", path = StockClient.PATH, configuration = [StockClient.StockClientFallback::class], fallback = StockClient.StockClientFallback::class)
interface StockClient {
    companion object {
        const val PATH = "/stock"
    }

    // 通过 @FeignClient 中的 configuration 注册一个 Spring Bean
    class StockClientFallback : StockClient {
        override fun getName(): String {
            return "fallback"
        }
    }

    @GetMapping("/getName")
    fun getName(): String
}