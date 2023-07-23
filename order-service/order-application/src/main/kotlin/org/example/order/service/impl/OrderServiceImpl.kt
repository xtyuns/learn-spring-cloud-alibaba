package org.example.order.service.impl

import org.example.order.service.OrderService
import org.example.stock.client.StockClient
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    val stockClient: StockClient
) : OrderService {
    override fun getName(): String {
        val s = stockClient.getName()
        return "$s -> OrderService"
    }
}