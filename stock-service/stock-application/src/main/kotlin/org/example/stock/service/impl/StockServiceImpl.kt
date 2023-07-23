package org.example.stock.service.impl

import org.example.stock.service.StockService
import org.springframework.stereotype.Service

@Service
class StockServiceImpl: StockService {
    override fun getName(): String {
        return "StockService"
    }
}