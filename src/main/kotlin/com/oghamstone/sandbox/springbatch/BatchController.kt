package com.oghamstone.sandbox.springbatch

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BatchController(var batchService: BatchService) {
    @GetMapping("/run")
    fun homePage() {
        batchService.triggerJob()
    }
}