package org.example.stock.controller

import org.example.stock.client.StockClient
import org.example.stock.service.StockService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(StockClient.PATH)
class StockController(
    val stockService: StockService
) : StockClient {
    override fun getName(): String {
        return stockService.getName()
    }
}